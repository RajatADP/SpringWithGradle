package com.learning.springwithgradle.di.constructor.xmlBased.collection.object.map;


import java.util.Map;

public class Student {

    private String name;
    private int id;
    private Map<Integer, Section> section;

    public Student(String name, int id, Map<Integer, Section> section) {
        this.name = name;
        this.id = id;
        this.section = section;
    }

    public void getStudentName() {
        System.out.println("Student Name is: " + name + " having id: " + id);
        for(Map.Entry<Integer, Section> map : section.entrySet()) {
            System.out.println("Key: " + map.getKey() + " value: " + map.getValue());
        }
    }
}
