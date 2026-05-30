package com.tka.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.Entity.Librarian;

@Repository
public interface LibrarianDao
extends JpaRepository<Librarian, Long> {

    // Find Librarian By Username

    Librarian findByUsername(String username);

    // Find Librarian By Password

    Librarian findByPassword(String password);

    // Find Librarian By Username And Password

    Librarian findByUsernameAndPassword(
            String username,
            String password
    );

    // Get All Librarians

    List<Librarian> findAll();
}