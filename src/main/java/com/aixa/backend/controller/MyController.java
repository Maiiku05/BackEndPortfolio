package com.aixa.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aixa.backend.model.PerfilPersonal;
import com.aixa.backend.service.IPerfilPersonalService;

@RestController
public class MyController {
    
    @Autowired
    public IPerfilPersonalService ppeServ;

    @GetMapping ("/ver/perfilpersonal")
    @ResponseBody
    public List<PerfilPersonal> verEduc(){
        return ppeServ.verPerfilPersonal();
    }

    @PostMapping ("/agregar/perfilpersonal")
    public void agregarDatosPerfilPersonal (@RequestBody PerfilPersonal rppe){
        ppeServ.agregarDatosPerfilPersonal(rppe);
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarDatosPerfilPersonal(@PathVariable Long id){
        ppeServ.borrarDatosPerfilPersonal(id);
    }

    @PutMapping ("/edit/perfilpersonal")
    public void editDatosPerfilPersonal (@RequestBody PerfilPersonal rppe){
        ppeServ.editDatosPerfilPersonal(rppe);
    }

}
