package com.studentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManagementSystem.entity.Student;

public interface StudentRepository extends  JpaRepository<Student, Long>{

}
