package com.tka.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByEmailAndPassword(String email, String password);
}