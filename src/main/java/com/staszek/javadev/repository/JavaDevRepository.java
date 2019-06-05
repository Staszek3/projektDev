package com.staszek.javadev.repository;

import com.staszek.javadev.model.JavaDev;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JavaDevRepository extends JpaRepository<JavaDev, Long> {
}
