package com.aixa.backend.service;

import java.util.List;

import com.aixa.backend.model.UrlToProjects;

public interface IProjService {

    public List<UrlToProjects> verProj ();

    public void agregarProj (UrlToProjects proj);

    public void borrarProj (Long id);

    public void editProj (UrlToProjects proj);
    
}
