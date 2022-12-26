package com.aixa.backend.service;

import java.util.List;

import com.aixa.backend.model.SkillStatus;

public interface ISkillService {

    public List<SkillStatus> verSkill ();

    public void agregarSkill (SkillStatus skill);

    public void borrarSkill (Long id);

    public void editSkill (SkillStatus skill);

}
