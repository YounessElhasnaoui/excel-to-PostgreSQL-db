package com.internship.exceltodb.dto;
import com.internship.exceltodb.annotation.ExcelColumn;
public class TypeAllDto {

    private String sheetName;

    @ExcelColumn(0)
    private String type;

    @ExcelColumn(1)
    private String nom;

    public TypeAllDto() {
        this.sheetName = "Types";
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "TypeAllDto{" +
                "sheetName='" + sheetName + '\'' +
                ", type='" + type + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
