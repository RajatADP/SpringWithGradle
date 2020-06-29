package com.learning.springwithgradle.di.constructor.xmlBased.collection.primitive;


import java.util.List;

public class Student {

    private String name;
    private int id;
    private List<String> section;

    public Student(String name, int id, List<String> section) {
        this.name = name;
        this.id = id;
        this.section = section;
    }

    public void getStudentName() {
        System.out.println("Student Name is: " + name + " having id: " + id);
        section.forEach(section -> {
            System.out.println(section);
        });
    }
}
