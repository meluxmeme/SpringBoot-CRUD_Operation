package com.example.CRUD_operation.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path ="api/student")
public class StudentController {

private final StudentService studentService;

@Autowired
public StudentController(StudentService studentServices) {
    this.studentService = studentServices;
}

@GetMapping	
public List<Student> getStudent(){
	return studentService.getStudent();
}

@PostMapping
public void registerNewStudent(@RequestBody Student student) {
    studentService.addNewStudent(student);
}

@DeleteMapping(path ="{studentId}")
public void deleteStudent(@PathVariable("studentId") int id){
    studentService.deleteStudent(id);
}
}
