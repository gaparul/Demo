package com.demo.paymentsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.paymentsdemo.entity.Student;
import com.demo.paymentsdemo.service.StudentService;

import lombok.*;

@AllArgsConstructor
@RestController
@RequestMapping("/filter")
public class FilterController {

    @Autowired
    StudentService studentService;

    @GetMapping("/{name}")
    public ResponseEntity<Student> getStudent(@PathVariable String name)
    {
        return new ResponseEntity<>(studentService.getStudent(name),HttpStatus.OK);
    }
    
}
