package com.aixa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class EduInfoEdit {

    @Id
    private int id;
    private String typEdu;
    private String institucion;
    private int date;
    private String icon;
    private String image;

    public EduInfoEdit(){}

    public EduInfoEdit(int id, String typEdu, String institucion, int date, String icon, String image){
        this.id = id;
        this.typEdu = typEdu;
        this.institucion = institucion;
        this.date = date;
        this.icon = icon;
        this.image = image;
    }



}
