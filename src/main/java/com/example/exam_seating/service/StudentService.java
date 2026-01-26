package com.example.exam_seating.service;

import com.example.exam_seating.entity.Student;
import com.example.exam_seating.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student addStudent(Student s) {
        s.setSeatNumber((int) (repo.count() + 1));
        return repo.save(s);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public void resetSeating() {
        repo.findAll().forEach(s -> {
            s.setSeatNumber(null);
            repo.save(s);
        });
    }
}
