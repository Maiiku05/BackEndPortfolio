package com.aixa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class LabExperiments {

    @Id
    private int id;
    private String urlLab;
    private String image;
    

    public LabExperiments(){}

    public LabExperiments(int id, String urlLab, String image){
        this.id = id;
        this.urlLab = urlLab;
        this.image = image;
        
    }

}