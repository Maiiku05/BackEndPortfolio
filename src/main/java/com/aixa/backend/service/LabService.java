package com.aixa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aixa.backend.model.LabExperiments;
import com.aixa.backend.repository.LabRepo;

@Service
public class LabService implements ILabService{
        
    @Autowired 
    public LabRepo labRep;

    @Override
    public List<LabExperiments> verLab() {
        
       return labRep.findAll();

    }

    @Override
    public void agregarLab(LabExperiments lab) {
         labRep.save(lab);
    }

    @Override
    public void borrarLab(Long id) {
        labRep.deleteById(id);
        
    }

    @Override
    public void editLab(LabExperiments lab) {
        labRep.save(lab);
        
    }
    
}
