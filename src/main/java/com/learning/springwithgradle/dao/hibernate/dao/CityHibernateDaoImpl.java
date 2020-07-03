package com.learning.springwithgradle.dao.hibernate.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CityHibernateDaoImpl {

    private SessionFactory sessionFactory;

    @Autowired
    public CityHibernateDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


        public int getCountInCityTable() {
        int totalRows = -1;
        try {
            String sql = "Select COUNT(*) from City";
            Query query = sessionFactory.openSession().createQuery(sql);
            totalRows = ((Long) query.uniqueResult()).intValue();

            return totalRows;
        } catch (Exception e) {
            e.printStackTrace();
            return totalRows;
        } finally {

            return totalRows;
        }

    }
}
