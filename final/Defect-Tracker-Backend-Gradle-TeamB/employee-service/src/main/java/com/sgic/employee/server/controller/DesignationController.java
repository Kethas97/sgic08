
package com.sgic.employee.server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.employee.server.dto.DesignationDto;
import com.sgic.employee.server.services.DesignationService;

@RestController
public class DesignationController {

	@Autowired
	DesignationService designationService;

	private static final Logger LOGGER = LoggerFactory.getLogger(DesignationController.class);

	@PostMapping("/designation")
	public ResponseEntity<Object> createDesignation(@RequestBody DesignationDto designationDto) {
		LOGGER.info("create successfully");
		designationService.createDesignation(designationDto);
		return ResponseEntity.ok("save Successfully!");
	}
	
	@PutMapping("/designation/{id}")
	public ResponseEntity<Object> updateDesignation(@PathVariable long id,@RequestBody DesignationDto designationDto){
		LOGGER.info("update successfully");
		designationService.updateDesignation(id,designationDto);
		return ResponseEntity.ok("update Successfully!");
	}
	
	@GetMapping("/designation/{id}")
	public DesignationDto getDesignation(@PathVariable Long id){
		LOGGER.info("retrieve successfully");
		return designationService.designationById(id);
	}
	
	@GetMapping("/designations")
	List<DesignationDto> getAllDesignations(){
		LOGGER.info("get all");
		return designationService.getAllDesignations();
	}

}
