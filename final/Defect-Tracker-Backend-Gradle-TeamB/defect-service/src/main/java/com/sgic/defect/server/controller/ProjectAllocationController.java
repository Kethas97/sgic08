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

import com.sgic.defect.server.dto.ProjectAllocationDto;
import com.sgic.defect.server.service.ProjectAllocationService;
import com.sgic.defect.server.serviceImpl.*;

public class ProjectAllocationController {

	@Autowired
	ProjectAllocationService projectAllocationService;
	
	private static final Logger logger= LoggerFactory.getLogger(ProjectController.class);
	
	@PostMapping("/projectAllocation/{id}")
	public ResponseEntity<Object> createProjectAllocation(@PathVariable Long id, @RequestBody ProjectAllocationDto projectAllocationDto) {
		projectAllocationService.createProjectAllocation(projectAllocationDto,id);
		return ResponseEntity.ok("Saved Successfully!");
	}
	
	@PutMapping("/projectAllocation/{id}")
	public ResponseEntity<Object> updateProject(@PathVariable Long id,@RequestBody ProjectAllocationDto ProjectAllocationDto) {
		projectAllocationService.updateProjectAllocation(id,ProjectAllocationDto);
		return ResponseEntity.ok("Updated Successfully!");
	}
	
	@GetMapping("/projectAllocation/{id}")
	public List<ProjectAllocationDto> getAllProjects(@PathVariable Long id) {
		return projectAllocationService.getAllProjectAllocation(id);
	}
	
	@GetMapping("/projectAllocations/{id}")
	public ProjectAllocationDto getProject(@PathVariable Long id) {
		return projectAllocationService.getProjecAllocationtById(id);
	}
	
	@DeleteMapping("/projectAllocation/{id}")
	public ResponseEntity<Object> deleteProject(@PathVariable Long id) {
		projectAllocationService.deleteProjectAllocation(id);
		return ResponseEntity.ok("Deleted Successfully!");
	}
	
	
}
