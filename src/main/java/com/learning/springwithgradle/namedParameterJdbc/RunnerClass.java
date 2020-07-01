package com.learning.springwithgradle.namedParameterJdbc;

import com.learning.springwithgradle.namedParameterJdbc.dao.CityDao;
import com.learning.springwithgradle.namedParameterJdbc.model.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("namedParameterJdbc.withSpring/bean.xml");
        CityDao obj = applicationContext.getBean(CityDao.class);
        City city = new City();
        city.setId(8888);
        city.setName("Pune");
        city.setCountryCode("IND");
        city.setDistrict("MH");
        city.setPopulation(1000);
        if(obj.insertInCityTable(city)!=0)
            System.out.println("Row inserted");
        else
            System.out.println("Row insertion failed");
    }
}
