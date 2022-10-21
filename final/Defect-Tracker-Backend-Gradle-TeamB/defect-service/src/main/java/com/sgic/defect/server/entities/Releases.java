
package com.sgic.defect.server.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(schema = "defect-service", name = "releases")

public class Releases implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long releaseId;
	private String releaseName;
	private Date date;
	private String sequence;
	private String type;
	private String status;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)

	@JoinColumn(name = "projectId", unique = true, nullable = false)

	private Project project;

}
