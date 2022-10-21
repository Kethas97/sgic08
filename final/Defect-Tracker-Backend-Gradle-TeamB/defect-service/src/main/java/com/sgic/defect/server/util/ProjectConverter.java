package com.sgic.defect.server.util;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.sgic.defect.server.dto.ProjectDto;
import com.sgic.defect.server.entities.Project;

@Component
public class ProjectConverter {

	public ProjectDto ProjectToProjectDto(Project project) {
		ProjectDto projectDto = new ProjectDto();
		BeanUtils.copyProperties(project, projectDto);
		return projectDto;
	}

	public List<ProjectDto> ProjectToProjectDto(List<Project> Project) {
		return Project.stream().map(project -> ProjectToProjectDto(project)).collect(Collectors.toList());
	}
}
