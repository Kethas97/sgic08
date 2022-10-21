
package com.sgic.employee.server.services;

import java.util.List;

import com.sgic.employee.server.dto.DesignationDto;

public interface DesignationService {
	void createDesignation(DesignationDto designationDto);
	void updateDesignation(Long id,DesignationDto designationDto);
	DesignationDto designationById(Long id);
	List<DesignationDto> getAllDesignations();

}
