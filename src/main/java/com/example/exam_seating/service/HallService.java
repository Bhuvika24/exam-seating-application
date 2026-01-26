package com.example.exam_seating.service;

import com.example.exam_seating.entity.Hall;
import com.example.exam_seating.repository.HallRepository;
import org.springframework.stereotype.Service;

@Service
public class HallService {

    private final HallRepository repo;

    public HallService(HallRepository repo) {
        this.repo = repo;
    }

    public Hall save(Hall hall) {
        return repo.save(hall);
    }
}
