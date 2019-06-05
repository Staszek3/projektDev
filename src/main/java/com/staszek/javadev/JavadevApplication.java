package com.staszek.javadev;

import com.staszek.javadev.repository.JavaDevRepository;
import com.staszek.javadev.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavadevApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JavadevApplication.class, args);
    }
    @Autowired
    JavaDevRepository javaDevRepository;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
