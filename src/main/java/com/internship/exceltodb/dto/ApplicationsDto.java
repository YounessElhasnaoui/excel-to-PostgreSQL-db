package com.internship.exceltodb.dto;
import com.internship.exceltodb.config.BatchConfiguration;
import com.internship.exceltodb.util.ValidationConfig;

import com.internship.exceltodb.annotation.ExcelColumn;
import java.util.Arrays;

import java.util.Date;

public class ApplicationsDto {

    private String sheetName;

    @ExcelColumn(0)
    private String application;

    @ExcelColumn(1)
    private String nomCourt;

    @ExcelColumn(2)
    private String commentaire;

    @ExcelColumn(3)
    private String irt;

    @ExcelColumn(4)
    private String sgHebergement;

    @ExcelColumn(5)
    private String sgDateDeMiseEnProd;

    @ExcelColumn(6)
    private String sgExpositionExterne;

    @ExcelColumn(7)
    private String sgCriticite;

    @ExcelColumn(8)
    private String sgCriticiteRs;

    @ExcelColumn(9)
    private String sgNbUtilisateurs;

    @ExcelColumn(10)
    private String sgNiveauApplication;

    @ExcelColumn(11)
    private String sgNiveauDImportanceMetier;

    @ExcelColumn(12)
    private String sgStatut;

    @ExcelColumn(13)
    private String sgTypeDAuthentification;

    @ExcelColumn(14)
    private String typeApplication;

    @ExcelColumn(15)
    private String sgIdMegaKear;

    @ExcelColumn(16)
    private String sgLastAccess;

    @ExcelColumn(17)
    private String sgCoutDeFonctionnement;

    @ExcelColumn(18)
    private String sgCoutDeLicence;

    @ExcelColumn(19)
    private String nom;

    @ExcelColumn(20)
    private Date dateDeCreation;

    @ExcelColumn(21)
    private Date dateDeModification;

    @ExcelColumn(22)
    private String sgIsEligibleAsa;

    @ExcelColumn(23)
    private String sgIsEligibleServer;

    @ExcelColumn(24)
    private String framework;

    @ExcelColumn(25)
    private String nombreDeTransactions;


    public ApplicationsDto() {
        this.sheetName = "Applications";
    }


    // Getters only
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getIrt() {
        return irt;
    }

    public void setIrt(String irt) {
        this.irt = irt;
    }

    public String getSgHebergement() {
        return sgHebergement;
    }

    public void setSgHebergement(String sgHebergement) {
        validate("SG - Hebergement", sgHebergement, 4);
        this.sgHebergement = sgHebergement;
    }

    public String getSgDateDeMiseEnProd() {
        return sgDateDeMiseEnProd;
    }

    public void setSgDateDeMiseEnProd(String sgDateDeMiseEnProd) {
        this.sgDateDeMiseEnProd = sgDateDeMiseEnProd;
    }

    public String getSgExpositionExterne() {
        return sgExpositionExterne;
    }

    public void setSgExpositionExterne(String sgExpositionExterne) {
        validate("SG - Exposition externe", sgExpositionExterne, 6);
        this.sgExpositionExterne = sgExpositionExterne;
    }

    public String getSgCriticite() {
        return sgCriticite;
    }

    public void setSgCriticite(String sgCriticite) {
        validate("SG - Criticité", sgCriticite, 7);
        this.sgCriticite = sgCriticite;
    }

    public String getSgCriticiteRs() {
        return sgCriticiteRs;
    }

    public void setSgCriticiteRs(String sgCriticiteRs) {
        validate("SG - Criticité RS", sgCriticiteRs, 8);
        this.sgCriticiteRs = sgCriticiteRs;
    }

    public String getSgNbUtilisateurs() {
        return sgNbUtilisateurs;
    }

    public void setSgNbUtilisateurs(String sgNbUtilisateurs) {
        validate("SG - NB utilisateurs", sgNbUtilisateurs, 9);
        this.sgNbUtilisateurs = sgNbUtilisateurs;
    }

    public String getSgNiveauApplication() {
        return sgNiveauApplication;
    }

    public void setSgNiveauApplication(String sgNiveauApplication) {
        validate("SG - Niveau application", sgNiveauApplication, 10);
        this.sgNiveauApplication = sgNiveauApplication;
    }

    public String getSgNiveauDImportanceMetier() {
        return sgNiveauDImportanceMetier;
    }

    public void setSgNiveauDImportanceMetier(String sgNiveauDImportanceMetier) {
        validate("SG - Niveau d'importance Métier", sgNiveauDImportanceMetier, 11);
        this.sgNiveauDImportanceMetier = sgNiveauDImportanceMetier;
    }

    public String getSgStatut() {
        return sgStatut;
    }

    public void setSgStatut(String sgStatut) {
        validate("SG - Statut", sgStatut, 12);
        this.sgStatut = sgStatut;
    }

    public String getSgTypeDAuthentification() {
        return sgTypeDAuthentification;
    }

    public void setSgTypeDAuthentification(String sgTypeDAuthentification) {
        validate("SG - Type d’authentification", sgTypeDAuthentification, 13);
        this.sgTypeDAuthentification = sgTypeDAuthentification;
    }

    public String getTypeApplication() {
        return typeApplication;
    }

    public void setTypeApplication(String typeApplication) {
        validate("Type application", typeApplication, 14);
        this.typeApplication = typeApplication;
    }

    public String getSgIdMegaKear() {
        return sgIdMegaKear;
    }

    public void setSgIdMegaKear(String sgIdMegaKear) {
        this.sgIdMegaKear = sgIdMegaKear;
    }

    public String getSgLastAccess() {
        return sgLastAccess;
    }

    public void setSgLastAccess(String sgLastAccess) {
        this.sgLastAccess = sgLastAccess;
    }

    public String getSgCoutDeFonctionnement() {
        return sgCoutDeFonctionnement;
    }

    public void setSgCoutDeFonctionnement(String sgCoutDeFonctionnement) {
        this.sgCoutDeFonctionnement = sgCoutDeFonctionnement;
    }

    public String getSgCoutDeLicence() {
        return sgCoutDeLicence;
    }

    public void setSgCoutDeLicence(String sgCoutDeLicence) {
        this.sgCoutDeLicence = sgCoutDeLicence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public Date getDateDeModification() {
        return dateDeModification;
    }

    public void setDateDeModification(Date dateDeModification) {
        this.dateDeModification = dateDeModification;
    }

    public String getSgIsEligibleAsa() {
        return sgIsEligibleAsa;
    }

    public void setSgIsEligibleAsa(String sgIsEligibleAsa) {
        validate("SG - Is Eligible ASA", sgIsEligibleAsa, 22);
        this.sgIsEligibleAsa = sgIsEligibleAsa;
    }

    public String getSgIsEligibleServer() {
        return sgIsEligibleServer;
    }

    public void setSgIsEligibleServer(String sgIsEligibleServer) {
        validate("SG - Is Eligible Server", sgIsEligibleServer, 23);
        this.sgIsEligibleServer = sgIsEligibleServer;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getNombreDeTransactions() {
        return nombreDeTransactions;
    }

    public void setNombreDeTransactions(String nombreDeTransactions) {
        this.nombreDeTransactions = nombreDeTransactions;
    }

    private void validate(String fieldName, String value, int cellIndex) {
        String[] possibleValues = ValidationConfig.getPossibleValues(sheetName, cellIndex);
        if (possibleValues != null && !Arrays.asList(possibleValues).contains(value)) {
            throw new IllegalArgumentException("Invalid value for " + fieldName + ": " + value);
        }
    }

    @Override
    public String toString() {
        return "ApplicationsDto{" +
                "sheetName='" + sheetName + '\'' +
                ", application='" + application + '\'' +
                ", nomCourt='" + nomCourt + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", irt='" + irt + '\'' +
                ", sgHebergement='" + sgHebergement + '\'' +
                ", sgDateDeMiseEnProd=" + sgDateDeMiseEnProd +
                ", sgExpositionExterne='" + sgExpositionExterne + '\'' +
                ", sgCriticite='" + sgCriticite + '\'' +
                ", sgCriticiteRs='" + sgCriticiteRs + '\'' +
                ", sgNbUtilisateurs='" + sgNbUtilisateurs + '\'' +
                ", sgNiveauApplication='" + sgNiveauApplication + '\'' +
                ", sgNiveauDImportanceMetier='" + sgNiveauDImportanceMetier + '\'' +
                ", sgStatut='" + sgStatut + '\'' +
                ", sgTypeDAuthentification='" + sgTypeDAuthentification + '\'' +
                ", typeApplication='" + typeApplication + '\'' +
                ", sgIdMegaKear='" + sgIdMegaKear + '\'' +
                ", sgLastAccess='" + sgLastAccess + '\'' +
                ", sgCoutDeFonctionnement=" + sgCoutDeFonctionnement +
                ", sgCoutDeLicence='" + sgCoutDeLicence + '\'' +
                ", nom='" + nom + '\'' +
                ", dateDeCreation=" + dateDeCreation +
                ", dateDeModification=" + dateDeModification +
                ", sgIsEligibleAsa='" + sgIsEligibleAsa + '\'' +
                ", sgIsEligibleServer='" + sgIsEligibleServer + '\'' +
                ", framework='" + framework + '\'' +
                ", nombreDeTransactions='" + nombreDeTransactions + '\'' +
                '}';
    }
}
