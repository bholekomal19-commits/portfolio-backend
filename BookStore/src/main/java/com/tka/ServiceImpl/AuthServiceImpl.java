package com.tka.ServiceImpl;

import com.tka.Entity.User;
import com.tka.Repository.UserRepository;
import com.tka.Service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public String loginUser(User user) {

        User existingUser = userRepository
                .findByEmail(user.getEmail())
                .orElse(null);

        if (existingUser != null &&
                existingUser.getPassword()
                        .equals(user.getPassword())) {

            return "Login Successful";
        }

        return "Invalid Email or Password";
    }
}