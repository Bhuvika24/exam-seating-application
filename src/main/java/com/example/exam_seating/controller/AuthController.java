package com.example.exam_seating.controller;

import com.example.exam_seating.entity.Admin;
import com.example.exam_seating.repository.AdminRepository;
import com.example.exam_seating.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AdminRepository repo;
    private final JwtUtil jwtUtil;

    public AuthController(AdminRepository repo, JwtUtil jwtUtil) {
        this.repo = repo;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Admin admin) {
        Admin db = repo.findByUsername(admin.getUsername());
        if (db != null && db.getPassword().equals(admin.getPassword())) {
            return Map.of("token", jwtUtil.generateToken(admin.getUsername()));
        }
        throw new RuntimeException("Invalid credentials");
    }
}
