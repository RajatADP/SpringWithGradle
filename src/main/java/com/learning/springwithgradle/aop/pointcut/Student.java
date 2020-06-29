package com.learning.springwithgradle.aop.pointcut;

import org.springframework.stereotype.Service;

@Service
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getStudentName() {
        System.out.println("Student Name is: " + name);
    }
}
