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

import com.aixa.backend.model.EduInfoEdit;
import com.aixa.backend.service.IEduService;

@RestController
public class EduController {
    
    @Autowired
    public IEduService eduserv;

    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<EduInfoEdit> verEduc(){
        return eduserv.verEduc();
    }

    @PostMapping ("/agregar/educacion")
    public void agregarEduc (@RequestBody EduInfoEdit edu){
        eduserv.agregarEduc(edu);
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarEduc(@PathVariable Long id){
        eduserv.borrarEduc(id);
    }

    @PutMapping ("/edit/educacion")
    public void editEduc (@RequestBody EduInfoEdit edu){
        eduserv.editEduc(edu);
    }

}
