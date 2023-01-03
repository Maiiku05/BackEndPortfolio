package com.aixa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PerfilProfesional {

    @Id
    private int id;
    private String typEdu;
    private String details;
    private String institucion;
    private int date;
    private String icon;
    private String image;
    private String skill;
    private String urlLab;
    private String urlProject;
    
    

    public PerfilProfesional(){}

    public PerfilProfesional(int id, String typEdu, String details, String institucion, int date, String icon, String image, String skill, String urlLab, String urlProject ){
        this.id = id;
        this.typEdu = typEdu;
        this.details = details;
        this.institucion = institucion;
        this.date = date;
        this.icon = icon;
        this.image = image;
        this.image = skill;
        this.image = urlLab;
        this.image = urlProject;
       
    }

}

