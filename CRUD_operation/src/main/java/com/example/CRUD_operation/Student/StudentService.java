package com.example.CRUD_operation.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
public static List<Student> getStudent(){
	return  List.of( 
						new Student(01,
									"Laxmi",
									"meluxmeme@gmail.com",
									LocalDate.of(1994, Month.APRIL, 5)
									)
	);
}
}
