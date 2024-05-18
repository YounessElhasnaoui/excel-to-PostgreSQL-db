package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_owner")
public class AppOwner {

    @Column(name = "application")
    private String application;

    @Column(name = "affectation_de_personne")
    private String affectationDePersonne;

    @Id
    @Column(name = "assignation_de_responsabilite")
    private String assignationDeResponsabilite;

    @Column(name = "nom_court")
    private String nomCourt;

    // Getters only
    public String getApplication() {
        return application;
    }

    public String getAffectationDePersonne() {
        return affectationDePersonne;
    }

    public String getAssignationDeResponsabilite() {
        return assignationDeResponsabilite;
    }

    public String getNomCourt() {
        return nomCourt;
    }
}