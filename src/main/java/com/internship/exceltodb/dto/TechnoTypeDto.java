package com.internship.exceltodb.dto;
import com.internship.exceltodb.annotation.ExcelColumn;
public class TechnoTypeDto {

    private String sheetName;

    @ExcelColumn(0)
    private String technologieLogicielle;

    @ExcelColumn(1)
    private String nomCourt;

    @ExcelColumn(3)
    private String type;

    public TechnoTypeDto() {
        this.sheetName = "Techno_Type";
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TechnoTypeDto{" +
                "sheetName='" + sheetName + '\'' +
                ", technologieLogicielle='" + technologieLogicielle + '\'' +
                ", nomCourt='" + nomCourt + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}