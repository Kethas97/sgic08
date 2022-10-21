package com.sgic.defect.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defect.server.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
