package com.learning.springwithgradle.di.constructor.xmlBased.object;


public class Student {

    private String name;
    private int id;
    private Section section;

    public Student(String name, int id, Section section) {
        this.name = name;
        this.id = id;
        this.section = section;
    }

    public void getStudentName() {
        System.out.println("Student Name is: " + name + " having id: " + id + " in section :" + section);
    }
}
