
package com.sgic.employee.server.servicesImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.employee.server.dto.DesignationDto;
import com.sgic.employee.server.entities.Designation;
import com.sgic.employee.server.repositories.DesignationRepository;
import com.sgic.employee.server.services.DesignationService;
import com.sgic.employee.server.util.DesignationConverter;


@Service
public class DesignationServiceImpl implements DesignationService {

	@Autowired
	DesignationRepository designationRepository;

	@Autowired
	DesignationConverter designationConverter;

	@Override
	public void createDesignation(DesignationDto designationDto) {
		Designation designation = new Designation();
		BeanUtils.copyProperties(designationDto, designation);
		designationRepository.save(designation);
	}
	@Override
	public void updateDesignation(Long id, DesignationDto designationDto) {
		Designation designation =designationRepository.findById(id).orElseThrow();
		BeanUtils.copyProperties(designationDto, designation);
		designationRepository.save(designation);
		
	}

	@Override
	public DesignationDto designationById(Long id) {
		Designation designation =designationRepository.findById(id).orElseThrow();
		DesignationDto designationDto=new DesignationDto();
		BeanUtils.copyProperties(designation,designationDto );
		designationRepository.save(designation);
		return designationDto;
	}

	@Override
	public List<DesignationDto> getAllDesignations() {
		List<Designation>designations=designationRepository.findAll();
		List<DesignationDto>designationDtos=designationConverter.DesignationToDesignationDto(designations);
		return designationDtos;
	}
	
}
