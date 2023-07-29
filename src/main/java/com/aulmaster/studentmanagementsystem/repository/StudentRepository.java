package com.aulmaster.studentmanagementsystem.repository;

import com.aulmaster.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
