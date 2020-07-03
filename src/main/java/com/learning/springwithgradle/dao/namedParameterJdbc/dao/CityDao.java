package com.learning.springwithgradle.dao.namedParameterJdbc.dao;

import com.learning.springwithgradle.dao.namedParameterJdbc.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Types;
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
        Map<String, Object> map = new HashMap<String, Object>();
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

    // SqlParameterSource is better than Map
    // We can use .addValue and define type of column in table
    public int deleteInCityTable(int id) {
        int rowAffected = -1;
        String sql = "DELETE FROM city where ID = :id";
        try {
            SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", id, Types.INTEGER);
            rowAffected = namedParameterJdbcTemplate.update(sql, namedParameters);
            return rowAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return rowAffected;
        }

    }

}

