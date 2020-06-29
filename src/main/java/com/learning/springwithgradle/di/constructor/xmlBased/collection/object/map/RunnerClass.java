package com.learning.springwithgradle.di.constructor.xmlBased.collection.object.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di.constructor.xmlBased/collection.map/bean1.xml");
        Student obj = applicationContext.getBean("student", Student.class);
        obj.getStudentName();
    }

}
