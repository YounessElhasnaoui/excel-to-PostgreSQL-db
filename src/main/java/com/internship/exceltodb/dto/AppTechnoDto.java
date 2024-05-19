package com.internship.exceltodb.dto;

import com.internship.exceltodb.annotation.ExcelColumn;
import com.internship.exceltodb.annotation.DtoField;

public class AppTechnoDto {

    private String sheetName;

    @ExcelColumn(0)
    @DtoField("application")
    private String application;

    @ExcelColumn(2)
    @DtoField("technologieLogicielleSupport")
    private String technologieLogicielleSupport;

    @ExcelColumn(3)
    @DtoField("technologieLogicielle")
    private String technologieLogicielle;

    @ExcelColumn(4)
    @DtoField("nomCourt")
    private String nomCourt;

    public AppTechnoDto() {
        this.sheetName = "App_Techno";
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getTechnologieLogicielleSupport() {
        return technologieLogicielleSupport;
    }

    public void setTechnologieLogicielleSupport(String technologieLogicielleSupport) {
        this.technologieLogicielleSupport = technologieLogicielleSupport;
    }

    public String getTechnologieLogicielle() {
        return technologieLogicielle;
    }

    public void setTechnologieLogicielle(String technologieLogicielle) {
        this.technologieLogicielle = technologieLogicielle;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }

    @Override
    public String toString() {
        return "AppTechnoDto{" +
                "sheetName='" + sheetName + '\'' +
                ", application='" + application + '\'' +
                ", technologieLogicielleSupport='" + technologieLogicielleSupport + '\'' +
                ", technologieLogicielle='" + technologieLogicielle + '\'' +
                ", nomCourt='" + nomCourt + '\'' +
                '}';
    }
}
