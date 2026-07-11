package com.minthant.studentAPI.repository;

import com.minthant.studentAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
        extends JpaRepository<Student, Long> {
}
