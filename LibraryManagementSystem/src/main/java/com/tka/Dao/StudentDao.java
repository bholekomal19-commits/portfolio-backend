package com.tka.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.Entity.Student;

@Repository
public interface StudentDao
extends JpaRepository<Student, Long> {

    // Find Student By Name

    List<Student> findByName(String name);

    // Find Student By Course

    List<Student> findByCourse(String course);

    // Find Student By Email

    Student findByEmail(String email);

    // Get All Students

    List<Student> findAll();
}