package com.sgic.defect.server.service;

import java.util.List;

import com.sgic.defect.server.dto.ProjectAllocationDto;
import com.sgic.defect.server.dto.ProjectDto;

public interface ProjectAllocationService {

    void createProjectAllocation(ProjectAllocationDto projectAllocationDto,Long projectId);
	
    ProjectAllocationDto getProjecAllocationtById(Long id);
	
	List<ProjectAllocationDto> getAllProjectAllocation(Long id);
	
	void updateProjectAllocation(Long id,ProjectAllocationDto projectAllocationDto);
	
	void deleteProjectAllocation(Long id);
}
