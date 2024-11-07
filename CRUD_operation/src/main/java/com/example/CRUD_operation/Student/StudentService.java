package com.example.CRUD_operation.Student;

import java.nio.channels.IllegalSelectorException;
import java.util.List;
import java.util.Optional;

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

public void addNewStudent(Student student) {
    Optional<Student> studentOptional = studentRepositary.findStudentByEmail(student.getEmail());
    
    if (studentOptional.isPresent()) {
        throw new IllegalStateException("Email taken");
    }
    
    studentRepositary.save(student);
}


public void deleteStudent(int studentId) {
	boolean exists = studentRepositary.existsById(studentId);
	if(!exists) {
		throw new IllegalStateException(
			"student with id " + "studentId" + "does not exist");
	}
studentRepositary.deleteById(studentId);
}
	
}

