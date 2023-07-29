package com.aulmaster.studentmanagementsystem.controller;

import com.aulmaster.studentmanagementsystem.entity.Student;
import com.aulmaster.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

        // HANDLER METHOD TO HANDLE LIST STUDENT AND RETURN MODE AND VIEW
    @GetMapping("/students")
    public String listStudents(Model model){

        model.addAttribute("students", studentService.getAllStudents());
        return "students";

    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        // CREATE STUDENT OBJECT TO HOLD STUDENT FORM DATA
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }


    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("students") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";

    }
}
