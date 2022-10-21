package com.sgic.defect.server.service;

import java.util.List;

import com.sgic.defect.server.dto.ProjectDto;

public interface ProjectService {

	void createProject(ProjectDto projectDto);
	
	ProjectDto getProjectById(Long id);
	
	List<ProjectDto> getAllProject();
	
	void updateProject(Long id,ProjectDto projectDto);
	
	void deleteProject(Long id);
	
	
}
