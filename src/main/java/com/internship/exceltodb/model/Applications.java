package com.internship.exceltodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "applications")
public class Applications {

    @Id
    @Column(name = "application")
    private String application;

    @Column(name = "nom_court")
    private String nomCourt;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "irt")
    private String irt;

    @Column(name = "sg_hebergement")
    private String sgHebergement;

    @Column(name = "sg_date_de_mise_en_prod")
    private String sgDateDeMiseEnProd;

    @Column(name = "sg_exposition_externe")
    private String sgExpositionExterne;

    @Column(name = "sg_criticite")
    private String sgCriticite;

    @Column(name = "sg_criticite_rs")
    private String sgCriticiteRs;

    @Column(name = "sg_nb_utilisateurs")
    private String sgNbUtilisateurs;

    @Column(name = "sg_niveau_application")
    private String sgNiveauApplication;

    @Column(name = "sg_niveau_d_importance_metier")
    private String sgNiveauDImportanceMetier;

    @Column(name = "sg_statut")
    private String sgStatut;

    @Column(name = "sg_type_d_authentification")
    private String sgTypeDAuthentification;

    @Column(name = "type_application")
    private String typeApplication;

    @Column(name = "sg_id_mega_kear")
    private String sgIdMegaKear;

    @Column(name = "sg_last_access")
    private String sgLastAccess;

    @Column(name = "sg_cout_de_fonctionnement")
    private String sgCoutDeFonctionnement;

    @Column(name = "sg_cout_de_licence")
    private String sgCoutDeLicence;

    @Column(name = "nom")
    private String nom;

    @Column(name = "date_de_creation")
    private String dateDeCreation;

    @Column(name = "date_de_modification")
    private String dateDeModification;

    @Column(name = "sg_is_eligible_asa")
    private String sgIsEligibleAsa;

    @Column(name = "sg_is_eligible_server")
    private String sgIsEligibleServer;

    @Column(name = "framework")
    private String framework;

    @Column(name = "nombre_de_transactions")
    private String nombreDeTransactions;

    // Getters only
    public String getApplication() {
        return application;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public String getIrt() {
        return irt;
    }

    public String getSgHebergement() {
        return sgHebergement;
    }

    public String getSgDateDeMiseEnProd() {
        return sgDateDeMiseEnProd;
    }

    public String getSgExpositionExterne() {
        return sgExpositionExterne;
    }

    public String getSgCriticite() {
        return sgCriticite;
    }

    public String getSgCriticiteRs() {
        return sgCriticiteRs;
    }

    public String getSgNbUtilisateurs() {
        return sgNbUtilisateurs;
    }

    public String getSgNiveauApplication() {
        return sgNiveauApplication;
    }

    public String getSgNiveauDImportanceMetier() {
        return sgNiveauDImportanceMetier;
    }

    public String getSgStatut() {
        return sgStatut;
    }

    public String getSgTypeDAuthentification() {
        return sgTypeDAuthentification;
    }

    public String getTypeApplication() {
        return typeApplication;
    }

    public String getSgIdMegaKear() {
        return sgIdMegaKear;
    }

    public String getSgLastAccess() {
        return sgLastAccess;
    }

    public String getSgCoutDeFonctionnement() {
        return sgCoutDeFonctionnement;
    }

    public String getSgCoutDeLicence() {
        return sgCoutDeLicence;
    }

    public String getNom() {
        return nom;
    }

    public String getDateDeCreation() {
        return dateDeCreation;
    }

    public String getDateDeModification() {
        return dateDeModification;
    }

    public String getSgIsEligibleAsa() {
        return sgIsEligibleAsa;
    }

    public String getSgIsEligibleServer() {
        return sgIsEligibleServer;
    }

    public String getFramework() {
        return framework;
    }

    public String getNombreDeTransactions() {
        return nombreDeTransactions;
    }
}
