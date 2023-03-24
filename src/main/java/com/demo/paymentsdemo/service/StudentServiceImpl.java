package com.demo.paymentsdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.paymentsdemo.entity.Student;
import com.demo.paymentsdemo.repository.StudentRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(String name) {
        return studentRepository.findByStudentName(name);
    }

}