package com.learning.springwithgradle.namedParameterJdbc.dao;

import com.learning.springwithgradle.namedParameterJdbc.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CityDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    public int insertInCityTable(City city) {
        int result = -1;
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            String sql = "INSERT INTO city VALUES (:ID, :Name, :CountryCode, :District, :Population)";
            map.put("ID", city.getId());
            map.put("Name", city.getName());
            map.put("CountryCode", city.getCountryCode());
            map.put("District", city.getDistrict());
            map.put("Population", city.getPopulation());
            namedParameterJdbcTemplate.update(sql, map);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        } finally {

            return result;
        }

    }

}

