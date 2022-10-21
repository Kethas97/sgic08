package com.sgic.defect.server.dto;

import java.util.List;

import com.sgic.defect.server.entities.ProjectAllocation;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class ProjectDto {

	private Long id;

	private String prefix;

	private String projectName;

	private String startDate;

	private String endDate;

	private String type;

	private String description;

	private String clientName;

	private String clientMobileNo;

	private String contactPersonName;

	private String contactPersonEmail;

	private String contactPersonMobileNo;

}
