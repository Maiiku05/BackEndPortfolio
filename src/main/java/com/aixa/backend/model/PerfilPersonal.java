package com.aixa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PerfilPersonal {

    @Id
    private Long id;
    private String name;
    private String lastname;
    private String frase;
    private String urlFoto;
    

    public PerfilPersonal(){}

    public PerfilPersonal(Long id, String name, String lastname, String frase, String urlFoto){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.frase = frase;
        this.urlFoto = urlFoto;
       
    }



}