package com.example.exam_seating.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.exam_seating.entity.Student;
import com.example.exam_seating.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // ✅ Auto seat allocation
    public Student allocateSeat(Student student) {

        String hall = student.getHall().trim();
        student.setHall(hall);

        List<Student> hallStudents = studentRepository.findByHall(hall);
        int nextSeat = hallStudents.size() + 1;

        student.setSeatNumber(nextSeat);
        return studentRepository.save(student);
    }

    // ✅ Bulk seat allocation
    public List<Student> allocateSeatsBulk(List<Student> students) {
        List<Student> saved = new ArrayList<>();
        for (Student s : students) {
            saved.add(allocateSeat(s));
        }
        return saved;
    }

    // ✅ Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // ✅ Update student
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existing = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        existing.setName(updatedStudent.getName());
        existing.setHall(updatedStudent.getHall());

        return studentRepository.save(existing);
    }

    // ✅ Delete student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    // ✅ Seating arrangement grouped by hall
    public Map<String, List<Student>> getSeatingArrangement() {

        List<Student> all = studentRepository.findAll();
        Map<String, List<Student>> map = new HashMap<>();

        for (Student s : all) {
            map.computeIfAbsent(s.getHall(), k -> new ArrayList<>()).add(s);
        }

        for (List<Student> list : map.values()) {
            list.sort(Comparator.comparing(Student::getSeatNumber));
        }

        return map;
    }
}
