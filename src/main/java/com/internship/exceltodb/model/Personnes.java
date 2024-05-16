package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "personnes")
public class Personnes {

    @Id
    @Column(name = "personne")
    private String personne;

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse_email")
    private String adresseEmail;

    // Getters only
    public String getPersonne() {
        return personne;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }
}
