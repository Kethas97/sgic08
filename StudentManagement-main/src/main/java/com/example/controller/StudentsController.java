package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.constants;
import com.example.entity.Students;
import com.example.services.StudentsService;

@RestController
public class StudentsController {

	@Autowired
	private StudentsService studentsService;
	
	@PostMapping(constants.CreteStudent)
	public Students saveStudents( @RequestBody Students student)
	{
		return studentsService.saveStudents(student);
	}
	
	@GetMapping("/Students")
	public List<Students> findAll()
	{
		return studentsService.findAll();
		
	}
	@DeleteMapping("/Students/{id}")
	public String deleteStudent(@PathVariable("id") Long id)
	{
		studentsService.deleteStudents(id);
		return "Delete successfully";
		
	}
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "welcome to  my world";
	}
}
