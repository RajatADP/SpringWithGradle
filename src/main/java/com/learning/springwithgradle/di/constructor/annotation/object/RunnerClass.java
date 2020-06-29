package com.learning.springwithgradle.di.constructor.annotation.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di.constructor.annotationBased.object/bean.xml");
        Student obj = applicationContext.getBean("student", Student.class);
        obj.getStudentName();
    }

}
