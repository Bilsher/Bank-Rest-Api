package com.example.bankcards.controller;

import com.example.bankcards.entity.UserEntity;
import com.example.bankcards.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request) {
        if (userRepository.existsByLogin(request.getLogin())) {
            return "User already exists";
        }

        UserEntity user = new UserEntity();
        user.setLogin(request.getLogin());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole("USER"); // По умолчанию роль USER

        userRepository.save(user);
        return "User registered successfully";
    }

}