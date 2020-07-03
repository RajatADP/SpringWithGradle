package com.learning.springwithgradle.dao.jdbc.withSpring;

import com.learning.springwithgradle.dao.jdbc.withSpring.dao.CityDao;
import com.learning.springwithgradle.dao.jdbc.withSpring.model.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class RunnerClass {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao/jdbc.withSpring/bean.xml");
        CityDao obj = applicationContext.getBean(CityDao.class);
        int rowCount = obj.getCountInCityTable();
        System.out.println("Total Rows : " + rowCount);
        List<String> city = obj.getNameOfCity("AFG");
        city.forEach(cityName -> {
            System.out.println("City Name : " + cityName);
        });
        City cityObj = obj.getCityMapperByID(1);
        System.out.println("City Name with id: 1 is " + cityObj.getName());

        List<City> cities = obj.getAllCityByCountryCode("AFG");
        System.out.println("ID, Name, CountryCode, District, Population");
        cities.forEach(city1 -> {
            System.out.println(city1.getId() + " " + city1.getName() + " " + city1.getCountryCode() + " " + city1.getDistrict()
            + " " + city1.getPopulation());
        });
    }
}
