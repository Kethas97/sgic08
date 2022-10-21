package com.sgic.defect.server.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defect.server.dto.ProjectDto;
import com.sgic.defect.server.entities.Project;
import com.sgic.defect.server.repositories.ProjectRepository;
import com.sgic.defect.server.service.ProjectService;
import com.sgic.defect.server.util.ProjectConverter;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	ProjectConverter projectConverter;

	@Override
	public void createProject(ProjectDto projectDto) {
		Project project = new Project();
		BeanUtils.copyProperties(projectDto, project);
		projectRepository.save(project);

	}

	@Override
	public ProjectDto getProjectById(Long id) {
		Project project = projectRepository.findById(id).orElseThrow();
		ProjectDto projectDto = new ProjectDto();
		BeanUtils.copyProperties(project, projectDto);
		return projectDto;
	}

	@Override
	public List<ProjectDto> getAllProject() {
		List<Project> projects = projectRepository.findAll();
		List<ProjectDto> projectDtos=projectConverter.ProjectToProjectDto(projects);
		return projectDtos;
	}

	@Override
	public void updateProject(Long id, ProjectDto projectDto) {
		Project project = projectRepository.findById(id).orElseThrow();
		BeanUtils.copyProperties(project, projectDto);
		projectRepository.save(project);
	}

	@Override
	public void deleteProject(Long id) {
         projectRepository.deleteById(id);
	}

}
