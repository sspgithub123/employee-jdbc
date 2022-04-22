package com.bridgelabz;

import java.sql.*;

public class EmployeeDatabase {
    public  static Connection getConnection() {
        Connection conn = null;
        try {
            String JDBC_URL = "jdbc:mysql://localhost:3306/database_employee?useSSL=false";
            String userName = "root";
            String password = "Archana@123";
            Connection connection;
            System.out.println("Connecting to database: " + JDBC_URL);
            connection = DriverManager.getConnection(JDBC_URL, userName, password);
            System.out.println("Connection is successful! " + connection);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        System.out.println("welcome to employee-jdbc program");
    }
}

