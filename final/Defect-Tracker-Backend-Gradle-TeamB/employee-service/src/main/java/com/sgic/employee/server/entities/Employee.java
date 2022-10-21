package com.sgic.employee.server.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "employee-service",name="employee")
@Getter
@Setter
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;

	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private Integer mobileNumber;
	
	@ManyToOne(fetch =  FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "designationId",unique = true,nullable = false)
	private Designation designation;
	
}
