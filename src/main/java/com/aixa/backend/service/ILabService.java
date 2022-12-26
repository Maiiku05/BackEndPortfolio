package com.aixa.backend.service;

import java.util.List;

import com.aixa.backend.model.LabExperiments;
 
public interface ILabService {
    
    public List<LabExperiments> verLab();

    public void agregarLab (LabExperiments lab);

    public void borrarLab (Long id);

    public void editLab (LabExperiments lab);

}
