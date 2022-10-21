package com.sgic.defect.server.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(schema = "defect-service", name = "defect" )
@Getter
@Setter

public class Defect implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long defectId;
	private String defectName;
	private String description;
	private String summary;
	private String report;
	private String assigned;
	private String product;
	private String releaseVersion;
	private String expectedResult;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "defectTypeId",unique = true,nullable = false)
	
	private DefectType defectType;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "defectStatusId",unique = true,nullable = false)
	
	private DefectStatus defectStatus;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "priorityId",unique = true,nullable = false)
	
	private Priority priority;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "severityId",unique = true,nullable = false)
	
	private Severity severity;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "moduleId",unique = true,nullable = false)
	
	private Module module;

}
