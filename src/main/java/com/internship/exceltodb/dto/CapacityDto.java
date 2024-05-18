package com.internship.exceltodb.dto;
import com.internship.exceltodb.annotation.ExcelColumn;
public class CapacityDto {

    private String sheetName;

    @ExcelColumn(0)
    private String capaciteMetier;

    @ExcelColumn(1)
    private String nomCourt;

    @ExcelColumn(2)
    private String commentaire;

    @ExcelColumn(3)
    private String sgCapailityIdposkear;

    public CapacityDto() {
        this.sheetName = "Capacite";
    }

    public String getCapaciteMetier() {
        return capaciteMetier;
    }

    public void setCapaciteMetier(String capaciteMetier) {
        this.capaciteMetier = capaciteMetier;
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

    public String getSgCapailityIdposkear() {
        return sgCapailityIdposkear;
    }

    public void setSgCapailityIdposkear(String sgCapailityIdposkear) {
        this.sgCapailityIdposkear = sgCapailityIdposkear;
    }

    @Override
    public String toString() {
        return "CapacityDto{" +
                "sheetName='" + sheetName + '\'' +
                ", capaciteMetier='" + capaciteMetier + '\'' +
                ", nomCourt='" + nomCourt + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", sgCapailityIdposkear='" + sgCapailityIdposkear + '\'' +
                '}';
    }
}
