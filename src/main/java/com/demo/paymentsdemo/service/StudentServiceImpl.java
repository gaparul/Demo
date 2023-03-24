package com.demo.paymentsdemo.service;

import java.util.List;

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
    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    
}