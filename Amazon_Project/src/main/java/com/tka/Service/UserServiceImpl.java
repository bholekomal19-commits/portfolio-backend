package com.tka.Service;

import com.tka.Entity.User;
import com.tka.Dao.UserDao;
import com.tka.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao Dao;

    @Override
    public User register(User user) {
        return Dao.save(user);
    }

    @Override
    public User login(String email, String password) {
        return Dao.findByEmailAndPassword(email, password);
    }
}