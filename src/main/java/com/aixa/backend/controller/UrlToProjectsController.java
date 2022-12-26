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


import com.aixa.backend.model.UrlToProjects;
import com.aixa.backend.service.IProjService;


@RestController
public class UrlToProjectsController {
    @Autowired
    public IProjService projserv;

    @GetMapping ("/ver/projects")
    @ResponseBody
    public List<UrlToProjects> verProj(){
        return projserv.verProj();
    }

    @PostMapping ("/agregar/projects")
    public void agregarProj (@RequestBody UrlToProjects proj){
        projserv.agregarProj(proj);
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarProj(@PathVariable Long id){
        projserv.borrarProj(id);
    }

    @PutMapping ("/edit/projects")
    public void editProj (@RequestBody UrlToProjects proj){
        projserv.editProj(proj);
    }

}
