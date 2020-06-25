package com.data.collect.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Agriculture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule_enqueteur;
    private String zone_enquete;
    private String nom_campement;
    @Temporal(TemporalType.DATE)
    private Date date_creation_campement;
    private String village_rattachement_campement;
    private int nombre_cases;

}
