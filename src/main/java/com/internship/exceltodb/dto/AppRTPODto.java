package com.internship.exceltodb.dto;
import com.internship.exceltodb.annotation.ExcelColumn;
import com.internship.exceltodb.annotation.DtoField;

public class AppRTPODto {

    private String sheetName;

    @ExcelColumn(0)
    @DtoField("application")
    private String application;

    @ExcelColumn(2)
    @DtoField("exigenceImposee")
    private String exigenceImposee;

    @ExcelColumn(3)
    @DtoField("exigence")
    private String exigence;

    @ExcelColumn(4)
    @DtoField("nomCourt")
    private String nomCourt;


    public AppRTPODto() {
        this.sheetName = "App_RTPO";
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getExigenceImposee() {
        return exigenceImposee;
    }

    public void setExigenceImposee(String exigenceImposee) {
        this.exigenceImposee = exigenceImposee;
    }

    public String getExigence() {
        return exigence;
    }

    public void setExigence(String exigence) {
        this.exigence = exigence;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }

    @Override
    public String toString() {
        return "AppRTPODto{" +
                "sheetName='" + sheetName + '\'' +
                ", application='" + application + '\'' +
                ", exigenceImposee='" + exigenceImposee + '\'' +
                ", exigence='" + exigence + '\'' +
                ", nomCourt='" + nomCourt + '\'' +
                '}';
    }
}
