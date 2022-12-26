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

import com.aixa.backend.model.SkillStatus;
import com.aixa.backend.service.ISkillService;

@RestController
public class SkillsController {
    
    @Autowired
    public ISkillService skillserv;

    @GetMapping ("/ver/skills")
    @ResponseBody
    public List<SkillStatus> verSkillStatus(){
        return skillserv.verSkill();
    }
  
    @PostMapping ("/agregar/skills")
    public void agregarSkill (@RequestBody SkillStatus skill){
        skillserv.agregarSkill(skill);
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillserv.borrarSkill(id);
    }

    @PutMapping ("/edit/skills")
    public void editSkill (@RequestBody SkillStatus skill){
        skillserv.editSkill(skill);
    }

}
