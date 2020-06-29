package com.learning.springwithgradle.di.constructor.xmlBased.factory.differentClass;


public class Student implements Reference {

    @Override
    public void factoryMethodCreatingReference() {
        System.out.println("A static factory method that returns instance of another class. It is used instance is not known and decided at runtime.");
    }
}
