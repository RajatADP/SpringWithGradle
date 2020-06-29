package com.learning.springwithgradle.aop.joinPoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Student obj = applicationContext.getBean(Student.class);
        obj.setName("Rajat");
        obj.getStudentName();
    }

}
