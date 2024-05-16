package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "app_tag")
public class AppTag {

    @Column(name = "application")
    private String application;

    @Id
    @Column(name = "tag")
    private String tag;

    @Column(name = "nom_court")
    private String nomCourt;

    @ManyToOne
    @JoinColumn(name = "application", foreignKey = @ForeignKey(name = "fk_application"))
    private Applications applications;

    // Getters only
    public String getApplication() {
        return application;
    }

    public String getTag() {
        return tag;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public Applications getApplications() {
        return applications;
    }
}
