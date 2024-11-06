package com.example.CRUD_operation.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositary extends 
                            JpaRepository<Student, Integer>{

}
