package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "type_all")
public class TypeAll {

    @Id
    @Column(name = "_type")
    private String type;

    @Column(name = "nom")
    private String nom;

    // Getters only
    public String getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }
}
