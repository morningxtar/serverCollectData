package com.data.collect.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Form implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String field_name;
    @Enumerated(EnumType.STRING)
    private Field_type field_type;
    @Column
    private String field_option;
    private int field_length;

}

enum Field_type {
    text, number, date, radio, select, file;
}
