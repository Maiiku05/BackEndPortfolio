package com.aixa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Form {

    @Id
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String message;
  
    public Form(){}

    public Form(int id, String name, String lastname, String email, String message ){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.message = message;
       
    }

}

