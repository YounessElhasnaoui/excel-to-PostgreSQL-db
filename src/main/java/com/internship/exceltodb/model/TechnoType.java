package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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

    @ManyToOne
    @JoinColumn(name = "type", foreignKey = @ForeignKey(name = "fk_type"))
    private Type typeEntity;

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

    public Type getTypeEntity() {
        return typeEntity;
    }
}
