package com.sgic.defect.server.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.defect.server.dto.ProjectDto;
import com.sgic.defect.server.entities.Project;
import com.sgic.defect.server.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	private static final Logger logger= LoggerFactory.getLogger(ProjectController.class);
	
	@PostMapping("/project")
	public ResponseEntity<Object> createProject(@RequestBody ProjectDto projectDto) {
		projectService.createProject(projectDto);
		return ResponseEntity.ok("Saved Successfully!");
	}
	
	@PutMapping("/project/{id}")
	public ResponseEntity<Object> updateProject(@PathVariable Long id,@RequestBody ProjectDto projectDto) {
		projectService.updateProject(id,projectDto);
		return ResponseEntity.ok("Updated Successfully!");
	}
	
	@GetMapping("/projects")
	public List<ProjectDto> getAllProjects() {
		logger.info("hello");
		return projectService.getAllProject();
	}
	
	@GetMapping("/project/{id}")
	public ProjectDto getProject(@PathVariable Long id) {
		return projectService.getProjectById(id);
	}
	
	@DeleteMapping("/project/{id}")
	public ResponseEntity<Object> deleteProject(@PathVariable Long id) {
		projectService.deleteProject(id);
		return ResponseEntity.ok("Deleted Successfully!");
	}
	
	
}
