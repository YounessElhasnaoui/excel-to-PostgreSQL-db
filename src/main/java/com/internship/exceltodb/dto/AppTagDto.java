package com.internship.exceltodb.dto;
import com.internship.exceltodb.annotation.ExcelColumn;

public class AppTagDto {

    private String sheetName;

    @ExcelColumn(0)
    private String application;

    @ExcelColumn(3)
    private String tag;

    @ExcelColumn(4)
    private String nomCourt;

    public AppTagDto() {
        this.sheetName = "App_Tag";
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNomCourt() {
        return nomCourt;
    }

    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }

    @Override
    public String toString() {
        return "AppTagDto{" +
                "sheetName='" + sheetName + '\'' +
                ", application='" + application + '\'' +
                ", tag='" + tag + '\'' +
                ", nomCourt='" + nomCourt + '\'' +
                '}';
    }
}
