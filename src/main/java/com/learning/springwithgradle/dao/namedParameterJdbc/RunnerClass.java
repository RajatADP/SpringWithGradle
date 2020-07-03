package com.learning.springwithgradle.dao.namedParameterJdbc;

import com.learning.springwithgradle.dao.namedParameterJdbc.dao.CityDao;
import com.learning.springwithgradle.dao.namedParameterJdbc.model.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao/namedParameterJdbc.withSpring/bean.xml");
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

        if(obj.deleteInCityTable(city.getId())!=0)
            System.out.println("Row deleted");
        else
            System.out.println("Row deleted failed");
    }
}
