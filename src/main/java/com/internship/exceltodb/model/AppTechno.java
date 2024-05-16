package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_techno")
public class AppTechno {

    @Column(name = "application")
    private String application;

    @Column(name = "technologie_logicielle_support")
    private String technologieLogicielleSupport;

    @Id
    @Column(name = "technologie_logicielle")
    private String technologieLogicielle;

    @Column(name = "nom_court")
    private String nomCourt;

    // Getters only
    public String getApplication() {
        return application;
    }

    public String getTechnologieLogicielleSupport() {
        return technologieLogicielleSupport;
    }

    public String getTechnologieLogicielle() {
        return technologieLogicielle;
    }

    public String getNomCourt() {
        return nomCourt;
    }
}
