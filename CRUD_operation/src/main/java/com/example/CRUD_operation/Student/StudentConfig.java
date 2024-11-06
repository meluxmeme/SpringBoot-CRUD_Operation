package com.example.CRUD_operation.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
        @Bean
        CommandLineRunner commandLineRunner(
                            StudentRepositary repositary){
                                return args->{
                                    Student Laxmi = new Student(
                                    1,    
                                    "Laxmi",
                                        "Laxmi@gmail.com",
                                        LocalDate.of(1994, Month.APRIL, 4)
                                    );
                                

                                Student Baral = new Student(
                                    2,    
                                    "Baral",
                                        "Baral@gmail.com",
                                        LocalDate.of(1993, Month.APRIL, 4)
                                    );
                                    repositary.saveAll(List.of(Laxmi, Baral));
                                };
                            };
                        }

