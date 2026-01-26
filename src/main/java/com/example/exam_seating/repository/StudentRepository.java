package com.example.exam_seating.repository;

import com.example.exam_seating.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
