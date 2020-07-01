package com.learning.springwithgradle.jdbc.withSpring.dao;

import com.learning.springwithgradle.jdbc.withSpring.mapper.CityRowMapper;
import com.learning.springwithgradle.jdbc.withSpring.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CityDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getCountInCityTable() {
        int totalRows = -1;
        try {
            String sql = "Select COUNT(*) from city";
            totalRows = jdbcTemplate.queryForObject(sql, Integer.class);

            return totalRows;
        } catch (Exception e) {
            e.printStackTrace();
            return totalRows;
        } finally {

            return totalRows;
        }

    }

    public List<String> getNameOfCity(String countryCode) {
        List<String> cityName = new ArrayList<String>();
        try {
            String sql = "Select Name from city WHERE CountryCode = ? AND Name NOT LIKE ('Q%')";
            cityName = jdbcTemplate.queryForList(sql, new Object[]{countryCode}, String.class);
            return cityName;
        } catch (Exception e) {
            e.printStackTrace();
            return cityName;
        }
    }

    public City getCityMapperByID(int id) {
        City city = null;
        try {
            String sql = "Select * from city WHERE ID = ?";
            city = jdbcTemplate.queryForObject(sql, new Object[]{id}, new CityRowMapper());
            return city;
        } catch (Exception e) {
            e.printStackTrace();
            return city;
        }
    }

    public List<City> getAllCityByCountryCode(String countryCode) {
        List<City> cities = new ArrayList<City>();
        String sql = "Select * from city WHERE CountryCode = ?";
        try {
            cities = jdbcTemplate.query(sql, new Object[]{countryCode}, new CityRowMapper());
            return cities;
        } catch (Exception e) {
            e.printStackTrace();
            return cities;
        }
    }
}

