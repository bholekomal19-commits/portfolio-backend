package com.tka.Service;

import com.tka.Entity.User;

public interface AuthService {

    User registerUser(User user);

    String loginUser(User user);
}