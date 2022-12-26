package com.aixa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aixa.backend.model.EduInfoEdit;

@Repository
public interface EduRepo extends JpaRepository <EduInfoEdit, Long>{

    
} 
