package com.demo.paymentsdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student")
@Data
public class Student {
    
    @Id
    @Column(name = "ID")
    private int id;
    
    @Column(name="mark")
    private int mark;
    
    @Column(name="name")
    private String name;
}
