package com.tka.Service;

import java.util.List;

import com.tka.Entity.Student;

public interface StudentService {

    // Add Student

    Student addStudent(
            Student student
    );

    // Get All Students

    List<Student> getAllStudents();

    // Get Student By Id

    Student getStudentById(
            Long id
    );

    // Update Student

    Student updateStudent(
            Student student
    );

    // Delete Student

    void deleteStudent(
            Long id
    );

    // Search Student By Name

    List<Student> getStudentByName(
            String name
    );

    // Search Student By Course

    List<Student> getStudentByCourse(
            String course
    );

    // Search Student By Email

    Student getStudentByEmail(
            String email
    );

}