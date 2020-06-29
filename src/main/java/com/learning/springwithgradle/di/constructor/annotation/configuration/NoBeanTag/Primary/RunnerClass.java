package com.learning.springwithgradle.di.constructor.annotation.configuration.NoBeanTag.Primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Student obj = applicationContext.getBean(Student.class);
        obj.getStudentName();
    }

}
