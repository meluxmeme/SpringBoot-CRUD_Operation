package com.example.CRUD_operation.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepositary studentRepositary;

	@Autowired
	public StudentService(StudentRepositary studentRepositary) {
		this.studentRepositary = studentRepositary;
	}


	public List<Student> getStudent(){

		return studentRepositary.findAll();
}
}
