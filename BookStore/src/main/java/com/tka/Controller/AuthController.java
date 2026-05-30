package com.tka.Controller;

import com.tka.Entity.User;
import com.tka.Service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")

@CrossOrigin("*")

public class AuthController {

    @Autowired
    private AuthService authService;

    // Register User
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {

        return authService.registerUser(user);
    }

    // Login User
    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {

        return authService.loginUser(user);
    }
}