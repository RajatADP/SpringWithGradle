package com.learning.springwithgradle.jdbc.withoutSpring.dao;


import java.sql.*;

public class CityDao {
    // JDBC driver name and database URL
    //static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/world";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String args[]) {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            //Class.forName(JDBC_DRIVER).newInstance();

            con = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "Select * from city WHERE id = ?";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 30);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Name");
                String countrycode = rs.getString("CountryCode");
                String district = rs.getString("District");
                int pop = rs.getInt("Population");

                System.out.print("ID: " + id);
                System.out.print(", name: " + name);
                System.out.print(", countrycode: " + countrycode);
                System.out.print(", district: " + district);
                System.out.print(", Population: " + pop);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (con != null)
                    con.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try

        }
    }
}

