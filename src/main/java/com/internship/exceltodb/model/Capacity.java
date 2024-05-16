package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "capacity")
public class Capacity {

    @Id
    @Column(name = "capacite_metier")
    private String capaciteMetier;

    @Column(name = "nom_court")
    private String nomCourt;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "sg_capaility_idposkear")
    private String sgCapailityIdposkear;

    // Getters only
    public String getCapaciteMetier() {
        return capaciteMetier;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public String getSgCapailityIdposkear() {
        return sgCapailityIdposkear;
    }
}
