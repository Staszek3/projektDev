package com.staszek.javadev.repository;

import com.staszek.javadev.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);
    Optional<Student> findStudentByIndexNr(String indexNr);

}
