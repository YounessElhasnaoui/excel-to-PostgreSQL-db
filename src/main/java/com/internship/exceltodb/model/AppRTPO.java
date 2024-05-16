package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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

    @ManyToOne
    @JoinColumn(name = "application", foreignKey = @ForeignKey(name = "fk_application"))
    private Applications applications;

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

    public Applications getApplications() {
        return applications;
    }
}
