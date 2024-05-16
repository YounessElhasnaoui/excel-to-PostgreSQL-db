package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_rtpo")
public class AppRTPO {

    @Column(name = "application")
    private String application;

    @Column(name = "exigence_imposee")
    private String exigenceImposee;

    @Id
    @Column(name = "exigence")
    private String exigence;

    @Column(name = "nom_court")
    private String nomCourt;

    // Getters only
    public String getApplication() {
        return application;
    }

    public String getExigenceImposee() {
        return exigenceImposee;
    }

    public String getExigence() {
        return exigence;
    }

    public String getNomCourt() {
        return nomCourt;
    }
}
