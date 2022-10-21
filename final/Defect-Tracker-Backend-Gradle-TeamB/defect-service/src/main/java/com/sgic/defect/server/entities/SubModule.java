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
@Table(schema = "defect-service", name = "subModule")

@Getter
@Setter
public class SubModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subModuleId;
	private String subModuleName;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)

	@JoinColumn(name = "releaseId", unique = true, nullable = false)

	private Releases releases;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "moduleId", unique = true, nullable = false)

	private Module module;

}
