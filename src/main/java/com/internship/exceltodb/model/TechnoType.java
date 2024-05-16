package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "techno_type")
public class TechnoType {

    @Id
    @Column(name = "technologie_logicielle")
    private String technologieLogicielle;

    @Column(name = "nom_court")
    private String nomCourt;

    @Column(name = "_type")
    private String type;

    // Getters only
    public String getTechnologieLogicielle() {
        return technologieLogicielle;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public String getType() {
        return type;
    }
}
