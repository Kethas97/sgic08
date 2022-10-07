package com.example.services;

import java.util.List;

import com.example.entity.Students;

public interface StudentsService {
	
	Students saveStudents(Students student);
	
	List<Students> findAll();
	
	void deleteStudents(Long id);

}
