package com.learning.springwithgradle.di.constructor.xmlBased.primitive;


public class Student {

    private String name;
    private int id;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getStudentName() {
        System.out.println("Student Name is: " + name + " having id: " + id);
    }
}
