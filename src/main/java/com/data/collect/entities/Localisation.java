package com.data.collect.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Localisation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String num_points;
    private String num_gps;
    private Double position_x;
    private Double position_y;


    public Localisation(String s, String s1, double v, double v1) {
        this.num_gps = s;
        this.num_points = s1;
        this.position_x = v;
        this.position_y = v1;
    }
}
