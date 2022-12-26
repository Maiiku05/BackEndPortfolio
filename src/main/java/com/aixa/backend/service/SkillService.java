package com.aixa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aixa.backend.model.SkillStatus;
import com.aixa.backend.repository.SkillRepo;

@Service
public class SkillService implements ISkillService {

    @Autowired 
    public SkillRepo skillRep;

    @Override
    public List<SkillStatus> verSkill() {
        return skillRep.findAll();
    }

    @Override
    public void agregarSkill(SkillStatus skill) {
        skillRep.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRep.deleteById(id);
        
    }

    @Override
    public void editSkill(SkillStatus skill) {
        skillRep.save(skill);
    }

   
    
    
}
