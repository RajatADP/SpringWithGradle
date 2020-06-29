package com.learning.springwithgradle.di.constructor.xmlBased.factory.sameClass;


public class Student {

    private static Student obj = new Student();

    private Student() {
        System.out.println("Inside private Constructor");
    }

    public static Student getInstance() {
        return obj;
    }

    public void factoryMethodCreatingReference() {
        System.out.println("A static factory method that returns instance of its own class. It is used in singleton design pattern.");
    }
}
