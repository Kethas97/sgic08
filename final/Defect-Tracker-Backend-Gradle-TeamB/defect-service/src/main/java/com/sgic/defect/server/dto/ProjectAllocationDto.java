package com.sgic.defect.server.dto;


import com.sgic.defect.server.entities.Project;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class ProjectAllocationDto {

	private Long id;

	private String employeeId;
	
	private String employeeName;
	
	private String role;

	private Long contribution;

	private Project project;
}
