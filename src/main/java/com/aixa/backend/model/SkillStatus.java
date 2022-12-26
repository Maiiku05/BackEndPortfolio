package com.aixa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SkillStatus {

    @Id
    private int id;
    private String name;
    private String icon;
    

    public SkillStatus(){}

    public SkillStatus(int id, String name, String icon){
        this.id = id;
        this.name = name;
        this.icon = icon;
        
    }

}