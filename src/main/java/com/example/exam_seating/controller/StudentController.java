package com.example.exam_seating.controller;

import com.example.exam_seating.entity.Student;
import com.example.exam_seating.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        return service.addStudent(s);
    }

    @GetMapping
    public List<Student> all() {
        return service.getAll();
    }

    @PostMapping("/reset")
    public void reset() {
        service.resetSeating();
    }
}
