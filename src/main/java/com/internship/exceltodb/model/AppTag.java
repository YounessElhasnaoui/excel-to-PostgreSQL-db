package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

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
}
