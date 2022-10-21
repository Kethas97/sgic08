package com.sgic.defect.server.serviceImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sgic.defect.server.dto.ProjectAllocationDto;
import com.sgic.defect.server.entities.Project;
import com.sgic.defect.server.entities.ProjectAllocation;
import com.sgic.defect.server.repositories.ProjectAllocationRepository;
import com.sgic.defect.server.repositories.ProjectRepository;
import com.sgic.defect.server.service.ProjectAllocationService;

@Service
public class ProjectAllocationServiceImpl implements ProjectAllocationService {
	

	@Autowired
	ProjectAllocationRepository projectAllocationRepository;
	
	@Autowired
	ProjectRepository projectRepository;


	
	@Override
	public void createProjectAllocation(ProjectAllocationDto projectAllocationDto,Long projectId) {
		ProjectAllocation projectAllocation=new ProjectAllocation();
		Project project=projectRepository.findById(projectId).get();
		projectAllocation.setEmployeeId(projectAllocationDto.getEmployeeId());
		projectAllocation.setEmployeeName(projectAllocationDto.getEmployeeName());
		projectAllocation.setContribution(projectAllocationDto.getContribution());
		projectAllocation.setProject(project);
		projectAllocationRepository.save(projectAllocation);
	}

	@Override
	public ProjectAllocationDto getProjecAllocationtById(Long id) {
		ProjectAllocation projectAllocation=projectAllocationRepository.findById(id).get();
		ProjectAllocationDto projectAllocationDto=new ProjectAllocationDto();
		BeanUtils.copyProperties(projectAllocationDto, projectAllocation);
		return projectAllocationDto;
		
	}

	@Override
	public List<ProjectAllocationDto> getAllProjectAllocation(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProjectAllocation(Long id, ProjectAllocationDto projectAllocationDto) {
		ProjectAllocation projectAllocation=projectAllocationRepository.findById(id).get();
		projectAllocation.setEmployeeId(projectAllocationDto.getEmployeeId());
		projectAllocation.setEmployeeName(projectAllocationDto.getEmployeeName());
		projectAllocation.setContribution(projectAllocationDto.getContribution());
		projectAllocationRepository.save(projectAllocation);
		
	}

	@Override
	public void deleteProjectAllocation(Long id) {
		projectAllocationRepository.deleteById(id);
		
	}


}
