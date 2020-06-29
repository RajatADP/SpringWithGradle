package com.learning.springwithgradle.di.constructor.annotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Student obj = applicationContext.getBean(Student.class);
        obj.getStudentName();
    }

}
