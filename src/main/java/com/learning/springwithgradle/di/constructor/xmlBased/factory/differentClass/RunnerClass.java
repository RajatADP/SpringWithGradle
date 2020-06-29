package com.learning.springwithgradle.di.constructor.xmlBased.factory.differentClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di.constructor.xmlBased/factory.differentClass/bean.xml");
        Student obj = applicationContext.getBean("referencefactoryimplBean", Student.class);
        obj.factoryMethodCreatingReference();
    }

}
