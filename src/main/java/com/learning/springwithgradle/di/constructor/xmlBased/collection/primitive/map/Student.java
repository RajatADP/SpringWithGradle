package com.learning.springwithgradle.di.constructor.xmlBased.collection.primitive.map;


import java.util.Map;

public class Student {

    private String name;
    private int id;
    private Map<String, String> section;

    public Student(String name, int id, Map<String, String> section) {
        this.name = name;
        this.id = id;
        this.section = section;
    }

    public void getStudentName() {
        System.out.println("Student Name is: " + name + " having id: " + id);
        for(Map.Entry<String, String> map : section.entrySet()) {
            System.out.println("Key: " + map.getKey() + " value: " + map.getValue());
        }
    }
}
