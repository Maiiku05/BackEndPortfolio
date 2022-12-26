package com.aixa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aixa.backend.model.SkillStatus;

@Repository
public interface SkillRepo extends JpaRepository <SkillStatus, Long>{

    
} 