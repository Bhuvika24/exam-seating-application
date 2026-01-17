package com.example.exam_seating.controller;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.*;
import com.example.exam_seating.entity.Student;
import com.example.exam_seating.service.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // ✅ Add student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.allocateSeat(student);
    }

    // ✅ Bulk add
    @PostMapping("/bulk")
    public List<Student> addBulk(@RequestBody List<Student> students) {
        return studentService.allocateSeatsBulk(students);
    }

    // ✅ Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // ✅ Update
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // ✅ Delete
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    // ✅ Seating arrangement
    @GetMapping("/seating-arrangement")
    public Map<String, List<Student>> seatingArrangement() {
        return studentService.getSeatingArrangement();
    }
}
