package com.learning.springwithgradle.di.constructor.xmlBased.autowired.constructor;


public class Student {

    private Section section;

    public Student() {
    }

    public Student(Section section) {
        this.section = section;
    }

    public void getStudentName() {
        section.printSection();
    }
}
