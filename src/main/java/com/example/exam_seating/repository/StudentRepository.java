package com.example.exam_seating.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.exam_seating.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByHall(String hall);
}
