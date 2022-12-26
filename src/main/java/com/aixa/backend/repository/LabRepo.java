package com.aixa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aixa.backend.model.LabExperiments;

@Repository
public interface LabRepo extends JpaRepository <LabExperiments, Long>{

    
} 