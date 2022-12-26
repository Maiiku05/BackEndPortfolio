package com.aixa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aixa.backend.model.UrlToProjects;

@Repository
public interface ProjectRepo extends JpaRepository <UrlToProjects, Long>{

    
} 