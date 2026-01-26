package com.example.exam_seating.entity;

import jakarta.persistence.*;

@Entity
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int capacity;

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
