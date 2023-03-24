package com.demo.paymentsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.paymentsdemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{
    Student findByName(String name);
}