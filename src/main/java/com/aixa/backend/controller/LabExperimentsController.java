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
 
import com.aixa.backend.model.LabExperiments;
import com.aixa.backend.service.ILabService;


@RestController
public class LabExperimentsController {
    
    @Autowired
    public ILabService labserv;

    @GetMapping ("/ver/laboratory")
    @ResponseBody
    public List<LabExperiments> verLab(){
        return labserv.verLab();
    }

    @PostMapping ("/agregar/lab")
    public void agregarLab (@RequestBody LabExperiments lab){
        labserv.agregarLab(lab);
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarLab(@PathVariable Long id){
        labserv.borrarLab(id);
    }

    @PutMapping ("/edit/laboratory")
    public void editLab (@RequestBody LabExperiments lab){
        labserv.editLab(lab);
    }

}
