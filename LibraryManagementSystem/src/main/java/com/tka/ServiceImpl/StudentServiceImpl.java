package com.tka.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.StudentDao;
import com.tka.Entity.Student;
import com.tka.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    // Add Student

    @Override
    public Student addStudent(
            Student student
    ) {

        return studentDao.save(student);
    }

    // Get All Students

    @Override
    public List<Student>
    getAllStudents() {

        return studentDao.findAll();
    }

    // Get Student By Id

    @Override
    public Student
    getStudentById(Long id) {

        return studentDao.findById(id)
                .orElse(null);
    }

    // Update Student

    @Override
    public Student
    updateStudent(
            Student student
    ) {

        return studentDao.save(student);
    }

    // Delete Student

    @Override
    public void deleteStudent(
            Long id
    ) {

        studentDao.deleteById(id);
    }

    // Search Student By Name

    @Override
    public List<Student>
    getStudentByName(
            String name
    ) {

        return studentDao.findByName(name);
    }

    // Search Student By Course

    @Override
    public List<Student>
    getStudentByCourse(
            String course
    ) {

        return studentDao.findByCourse(course);
    }

    // Search Student By Email

    @Override
    public Student
    getStudentByEmail(
            String email
    ) {

        return studentDao.findByEmail(email);
    }
}