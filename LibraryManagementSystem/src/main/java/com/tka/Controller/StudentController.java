package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.Entity.Student;
import com.tka.Service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String studentPage(Model model) {

        List<Student> students =
                studentService.getAllStudents();

        model.addAttribute("students", students);

        return "students";
    }

    @GetMapping("/addStudent")
    public String addStudentPage() {

        return "addstudent";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(

            @RequestParam String name,
            @RequestParam String department,
            @RequestParam String course,
            @RequestParam String rollNo,
            @RequestParam String email,
            @RequestParam String contact

    ) {

        Student student = new Student();

        student.setName(name);
        student.setDepartment(department);
        student.setCourse(course);
        student.setRollNo(rollNo);
        student.setEmail(email);
        student.setContact(contact);

        studentService.addStudent(student);

        return "redirect:/students";
    }
    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam Long id) {

        studentService.deleteStudent(id);

        return "redirect:/students";
    }
}