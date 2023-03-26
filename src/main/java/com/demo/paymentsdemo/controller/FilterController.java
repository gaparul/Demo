package com.demo.paymentsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.paymentsdemo.entity.Student;
import com.demo.paymentsdemo.service.FilterSpecification;
import com.demo.paymentsdemo.service.StudentService;
import java.util.List;

import lombok.*;



@AllArgsConstructor
@RestController
@RequestMapping("/filter")
public class FilterController {

    StudentService studentService;
    FilterSpecification<Student> studentFilterSpecification;

    @GetMapping("/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name)
    {
        return new ResponseEntity<>(studentService.getStudentByName(name),HttpStatus.OK);
    }

    @GetMapping("ID/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id)
    {
        return new ResponseEntity<>(studentService.getStudent(id),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getStudents()
    {
        return new ResponseEntity<>(studentService.getStudents(),HttpStatus.OK);
    }

    @PostMapping("/specification")
    public ResponseEntity<List<Student>> getStudentsSpecification()
    {
        return new ResponseEntity<>(studentService.getStudentsSpecification(),HttpStatus.OK);
    }

    // @PostMapping("/dynamicspecification")
    // public ResponseEntity<List<Student>> getSearchSpecification(@RequestBody com.demo.paymentsdemo.dto.RequestDto RequestDto)
    // {
        
    // }
    
    
    

    
}
