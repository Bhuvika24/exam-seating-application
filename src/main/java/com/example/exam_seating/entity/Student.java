package com.example.exam_seating.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String hall;
    private Integer seatNumber;

    public Student() {}

    public Student(String name, String hall) {
        this.name = name;
        this.hall = hall;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHall() {
        return hall;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }
}
