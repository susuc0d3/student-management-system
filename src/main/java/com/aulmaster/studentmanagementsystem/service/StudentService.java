package com.aulmaster.studentmanagementsystem.service;

import com.aulmaster.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
