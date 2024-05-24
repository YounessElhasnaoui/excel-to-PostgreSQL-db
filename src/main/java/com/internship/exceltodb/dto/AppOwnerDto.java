package com.internship.exceltodb.dto;
import com.internship.exceltodb.annotation.ExcelColumn;
import com.internship.exceltodb.annotation.DtoField;

public class AppOwnerDto {

    private String sheetName;

    @ExcelColumn(0)
    @DtoField("application")
    private String application;

    @ExcelColumn(2)
    @DtoField("affectationDePersonne")
    private String affectationDePersonne;

    @ExcelColumn(3)
    @DtoField("assignationDeResponsabilite")
    private String assignationDeResponsabilite;

    @ExcelColumn(4)
    @DtoField("nomCourt")
    private String nomCourt;



    public AppOwnerDto() {
        this.sheetName = "App_Owner";
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAffectationDePersonne() {
        return affectationDePersonne;
    }

    public void setAffectationDePersonne(String affectationDePersonne) {
        this.affectationDePersonne = affectationDePersonne;
    }

    public String getAssignationDeResponsabilite() {
        return assignationDeResponsabilite;
    }

    public void setAssignationDeResponsabilite(String assignationDeResponsabilite) {
        this.assignationDeResponsabilite = assignationDeResponsabilite;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }

    @Override
    public String toString() {
        return "AppOwnerDto{" +
                "sheetName='" + sheetName + '\'' +
                ", application='" + application + '\'' +
                ", affectationDePersonne='" + affectationDePersonne + '\'' +
                ", assignationDeResponsabilite='" + assignationDeResponsabilite + '\'' +
                ", nomCourt='" + nomCourt + '\'' +
                '}';
    }
}
