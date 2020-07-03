package com.learning.springwithgradle.dao.hibernate;

import com.learning.springwithgradle.dao.hibernate.dao.CityHibernateDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao/hibernate/bean.xml");
        CityHibernateDaoImpl obj = applicationContext.getBean(CityHibernateDaoImpl.class);
        int rowCount = obj.getCountInCityTable();
        System.out.println("Total Rows : " + rowCount);
    }
}
