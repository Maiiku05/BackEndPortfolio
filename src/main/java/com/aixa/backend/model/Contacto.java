package com.aixa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contacto {

    @Id
    private int id;
    private String redes;
    private String urlImage;
  
    public Contacto(){}

    public Contacto(int id, String redes, String urlImage){
        this.id = id;
        this.redes = redes;
        this.urlImage = urlImage;
       
    }

}

