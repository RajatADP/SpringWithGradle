package com.learning.springwithgradle.di.constructor.annotation.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student {


    private Section section;

    @Autowired
    public Student(Section section) {
        this.section = section;
    }

    public void getStudentName() {
        System.out.println("Student Name is: Rajat");
        section.printSection();
    }
}
