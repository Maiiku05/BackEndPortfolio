package com.aixa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.aixa.backend.model.UrlToProjects;
import com.aixa.backend.repository.ProjectRepo;

@Service
public class ProjService implements IProjService {

    @Autowired 
    public ProjectRepo projRep;

    @Override
    public List<UrlToProjects> verProj() {
      
        return projRep.findAll();
    }

    @Override
    public void agregarProj(UrlToProjects proj) {
        projRep.save(proj);
        
    }

    @Override
    public void borrarProj(Long id) {
        projRep.deleteById(id);
        
    }

    @Override
    public void editProj(UrlToProjects proj) {
        projRep.save(proj);
        
    }

    
    
}
