package com.sgic.defect.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "defect-service", name = "project")
@Getter
@Setter
public class Project implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String prefix;
	
	@Column(unique = true)
	private String projectName;
	
	@Column(nullable = false)
	private String startDate;
	
	@Column(nullable = false)
	private String endDate;
	
	@Column(nullable = false)
	private String type;
	
	@Column(nullable = false)
	private String description;
	
	private String clientName;
	
	private String clientMobileNo;
	
	private String contactPersonName;
	
	private String contactPersonEmail;
	
	private String contactPersonMobileNo;
	
	

}
