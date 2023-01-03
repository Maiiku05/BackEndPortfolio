package com.aixa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aixa.backend.model.PerfilPersonal;
import com.aixa.backend.repository.RepositoryPerfilPersonal;

@Service
public class PerfilPersonalService implements IPerfilPersonalService {

    @Autowired 
    public RepositoryPerfilPersonal rppe;

    @Override
    public List<PerfilPersonal> verPerfilPersonal() {
      
        return rppe.findAll(); 
    }

    @Override
    public void agregarDatosPerfilPersonal(PerfilPersonal ppe) {
     
        rppe.save(ppe);
        
    }

    @Override
    public void borrarDatosPerfilPersonal(Long id) {
       
        rppe.deleteById(id);
        
    }

    @Override
    public void editDatosPerfilPersonal(PerfilPersonal ppe) {
        
        rppe.save(ppe);
        
    }
    
}
