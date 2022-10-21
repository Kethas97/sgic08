
package com.sgic.employee.server.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.sgic.employee.server.dto.DesignationDto;
import com.sgic.employee.server.entities.Designation;

@Component
public class DesignationConverter {
	public DesignationDto DesignationToDesignationDto(Designation designation) {
		DesignationDto designationDto = new DesignationDto();
		BeanUtils.copyProperties(designation, designationDto);
		return designationDto;
	}

	public List<DesignationDto> DesignationToDesignationDto(List<Designation> Designation) {
		return Designation.stream().map(designation -> DesignationToDesignationDto(designation))
				.collect(Collectors.toList());
	}

}
