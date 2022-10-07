package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Students;
import com.example.repositories.StudentsRepository;


@Service
public class StudentsServiceImplement implements StudentsService {

	
	@Autowired
	StudentsRepository studentRepository;
	

	@Override
	public Students saveStudents(Students student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void deleteStudents(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}





	

	

}
