package com.tka.Service;

import com.tka.Entity.User;

public interface UserService {

    User register(User user);

    User login(String email, String password);
}