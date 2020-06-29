package com.learning.springwithgradle.di.constructor.annotation.basic;

import org.springframework.stereotype.Service;

@Service
public class Student {

    public void getStudentName() {
        System.out.println("Student Name is: Rajat");
    }
}
