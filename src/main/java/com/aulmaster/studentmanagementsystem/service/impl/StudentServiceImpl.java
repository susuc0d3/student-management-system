package com.aulmaster.studentmanagementsystem.service.impl;

import com.aulmaster.studentmanagementsystem.entity.Student;
import com.aulmaster.studentmanagementsystem.repository.StudentRepository;
import com.aulmaster.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
