package com.internship.exceltodb.dto;
import com.internship.exceltodb.annotation.ExcelColumn;
public class PersonnesDto {

    private String sheetName;

    @ExcelColumn(0)
    private String personne;

    @ExcelColumn(1)
    private String nom;

    @ExcelColumn(2)
    private String adresseEmail;

    public PersonnesDto() {
        this.sheetName = "Personnes";
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getPersonne() {
        return personne;
    }

    public void setPersonne(String personne) {
        this.personne = personne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    @Override
    public String toString() {
        return "PersonnesDto{" +
                "sheetName='" + sheetName + '\'' +
                ", personne='" + personne + '\'' +
                ", nom='" + nom + '\'' +
                ", adresseEmail='" + adresseEmail + '\'' +
                '}';
    }
}
