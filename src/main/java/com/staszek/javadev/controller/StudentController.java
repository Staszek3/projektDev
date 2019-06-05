package com.staszek.javadev.controller;

import com.staszek.javadev.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
        @Autowired
    StudentRepository studentRepository;
}
