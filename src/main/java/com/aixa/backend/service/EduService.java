package com.aixa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aixa.backend.model.EduInfoEdit;
import com.aixa.backend.repository.EduRepo;

@Service
public class EduService implements IEduService {

    @Autowired 
    public EduRepo eduRep;

    @Override
    public List<EduInfoEdit> verEduc() {
      
        return eduRep.findAll();
    }

    @Override
    public void agregarEduc(EduInfoEdit edu) {
     
        eduRep.save(edu);
        
    }

    @Override
    public void borrarEduc(Long id) {
       
        eduRep.deleteById(id);
        
    }

    @Override
    public void editEduc(EduInfoEdit edu) {
        
        eduRep.save(edu);
        
    }
    
}
