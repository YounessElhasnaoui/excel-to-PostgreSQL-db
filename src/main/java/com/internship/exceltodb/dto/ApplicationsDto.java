package com.internship.exceltodb.dto;

import com.internship.exceltodb.annotation.DtoField;
import com.internship.exceltodb.annotation.ExcelColumn;
import com.internship.exceltodb.util.ValidationUtil;


public class ApplicationsDto {

    private String sheetName;

    public ApplicationsDto() {
        this.sheetName = "Applications";
    }

    @DtoField("application")
    @ExcelColumn(0)
    private String application;

    @ExcelColumn(1)
    @DtoField("nomCourt")
    private String nomCourt;

    @ExcelColumn(2)
    @DtoField("commentaire")
    private String commentaire;

    @ExcelColumn(3)
    @DtoField("irt")
    private String irt;

    @ExcelColumn(4)
    @DtoField("sgHebergement")
    private String sgHebergement;

    @ExcelColumn(5)
    @DtoField("sgDateDeMiseEnProd")
    private String sgDateDeMiseEnProd;

    @ExcelColumn(6)
    @DtoField("sgExpositionExterne")
    private String sgExpositionExterne;

    @ExcelColumn(7)
    @DtoField("sgCriticite")
    private String sgCriticite;

    @ExcelColumn(8)
    @DtoField("sgCriticiteRs")
    private String sgCriticiteRs;

    @ExcelColumn(9)
    @DtoField("sgNbUtilisateurs")
    private String sgNbUtilisateurs;

    @ExcelColumn(10)
    @DtoField("sgNiveauApplication")
    private String sgNiveauApplication;

    @ExcelColumn(11)
    @DtoField("sgNiveauDImportanceMetier")
    private String sgNiveauDImportanceMetier;

    @ExcelColumn(12)
    @DtoField("sgStatut")
    private String sgStatut;

    @ExcelColumn(13)
    @DtoField("sgTypeDAuthentification")
    private String sgTypeDAuthentification;

    @ExcelColumn(14)
    @DtoField("typeApplication")
    private String typeApplication;

    @ExcelColumn(15)
    @DtoField("sgIdMegaKear")
    private String sgIdMegaKear;

    @ExcelColumn(16)
    @DtoField("sgLastAccess")
    private String sgLastAccess;

    @ExcelColumn(17)
    @DtoField("sgCoutDeFonctionnement")
    private String sgCoutDeFonctionnement;

    @ExcelColumn(18)
    @DtoField("sgCoutDeLicence")
    private String sgCoutDeLicence;

    @ExcelColumn(19)
    @DtoField("nom")
    private String nom;

    @ExcelColumn(20)
    @DtoField("dateDeCreation")
    private String dateDeCreation;

    @ExcelColumn(21)
    @DtoField("dateDeModification")
    private String dateDeModification;

    @ExcelColumn(22)
    @DtoField("sgIsEligibleAsa")
    private String sgIsEligibleAsa;

    @ExcelColumn(23)
    @DtoField("sgIsEligibleServer")
    private String sgIsEligibleServer;

    @ExcelColumn(24)
    @DtoField("framework")
    private String framework;

    @ExcelColumn(25)
    @DtoField("nombreDeTransactions")
    private String nombreDeTransactions;


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
        if (ValidationUtil.validate("Applications", 4, sgHebergement)) {
            this.sgHebergement = sgHebergement;
        } else {
            throw new IllegalArgumentException("Invalid value for sgHebergement");
        }
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
        if (ValidationUtil.validate("Applications", 6, sgExpositionExterne)) {
            this.sgExpositionExterne = sgExpositionExterne;
        } else {
            throw new IllegalArgumentException("Invalid value for sgExpositionExterne");
        }
    }

    public String getSgCriticite() {
        return sgCriticite;
    }

    public void setSgCriticite(String sgCriticite) {
        if (ValidationUtil.validate("Applications", 7, sgCriticite)) {
            this.sgCriticite = sgCriticite;
        } else {
            throw new IllegalArgumentException("Invalid value for sgCriticite");
        }
    }

    public String getSgCriticiteRs() {
        return sgCriticiteRs;
    }

    public void setSgCriticiteRs(String sgCriticiteRs) {
        if (ValidationUtil.validate("Applications", 8, sgCriticiteRs)) {
            this.sgCriticiteRs = sgCriticiteRs;
        } else {
            throw new IllegalArgumentException("Invalid value for sgCriticiteRs");
        }
    }

    public String getSgNbUtilisateurs() {
        return sgNbUtilisateurs;
    }

    public void setSgNbUtilisateurs(String sgNbUtilisateurs) {
        if (ValidationUtil.validate("Applications", 9, sgNbUtilisateurs)) {
            this.sgNbUtilisateurs = sgNbUtilisateurs;
        } else {
            throw new IllegalArgumentException("Invalid value for sgNbUtilisateurs");
        }
    }

    public String getSgNiveauApplication() {
        return sgNiveauApplication;
    }

    public void setSgNiveauApplication(String sgNiveauApplication) {
        if (ValidationUtil.validate("Applications", 10, sgNiveauApplication)) {
            this.sgNiveauApplication = sgNiveauApplication;
        } else {
            throw new IllegalArgumentException("Invalid value for sgNiveauApplication");
        }
    }

    public String getSgNiveauDImportanceMetier() {
        return sgNiveauDImportanceMetier;
    }

    public void setSgNiveauDImportanceMetier(String sgNiveauDImportanceMetier) {
        if (ValidationUtil.validate("Applications", 11, sgNiveauDImportanceMetier)) {
            this.sgNiveauDImportanceMetier = sgNiveauDImportanceMetier;
        } else {
            throw new IllegalArgumentException("Invalid value for sgNiveauDImportanceMetier");
        }
    }

    public String getSgStatut() {
        return sgStatut;
    }

    public void setSgStatut(String sgStatut) {
        if (ValidationUtil.validate("Applications", 12, sgStatut)) {
            this.sgStatut = sgStatut;
        } else {
            throw new IllegalArgumentException("Invalid value for sgStatut");
        }
    }

    public String getSgTypeDAuthentification() {
        return sgTypeDAuthentification;
    }

    public void setSgTypeDAuthentification(String sgTypeDAuthentification) {
        if (ValidationUtil.validate("Applications", 13, sgTypeDAuthentification)) {
            this.sgTypeDAuthentification = sgTypeDAuthentification;
        } else {
            throw new IllegalArgumentException("Invalid value for sgTypeDAuthentification");
        }
    }

    public String getTypeApplication() {
        return typeApplication;
    }

    public void setTypeApplication(String typeApplication) {
        if (ValidationUtil.validate("Applications", 14, typeApplication)) {
            this.typeApplication = typeApplication;
        } else {
            throw new IllegalArgumentException("Invalid value for typeApplication");
        }
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

    public String getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(String dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public String getDateDeModification() {
        return dateDeModification;
    }

    public void setDateDeModification(String dateDeModification) {
        this.dateDeModification = dateDeModification;
    }

    public String getSgIsEligibleAsa() {
        return sgIsEligibleAsa;
    }

    public void setSgIsEligibleAsa(String sgIsEligibleAsa) {
        if (ValidationUtil.validate("Applications", 22, sgIsEligibleAsa)) {
            this.sgIsEligibleAsa = sgIsEligibleAsa;
        } else {
            throw new IllegalArgumentException("Invalid value for sgIsEligibleAsa");
        }
    }

    public String getSgIsEligibleServer() {
        return sgIsEligibleServer;
    }

    public void setSgIsEligibleServer(String sgIsEligibleServer) {
        if (ValidationUtil.validate("Applications", 23, sgIsEligibleServer)) {
            this.sgIsEligibleServer = sgIsEligibleServer;
        } else {
            throw new IllegalArgumentException("Invalid value for sgIsEligibleServer");
        }
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
