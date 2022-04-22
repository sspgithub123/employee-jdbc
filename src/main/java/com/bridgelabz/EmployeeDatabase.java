package com.bridgelabz;

import java.sql.*;

public class EmployeeDatabase {
    public  static Connection getConnection() {
        Connection conn = null;
        try {
            String JDBC_URL = "jdbc:mysql://localhost:3306/database_employee?useSSL=false";
            String userName = "root";
            String password = "Pawar@1995";
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

    // Insert data
    public  static  void insert() {
        String sql="insert into employee(id,name,date)"+
                "values('4','Shubham','2022-07-15')";

        Connection conn =getConnection();
        try {
            Statement st=conn.createStatement();
            int count =st.executeUpdate(sql);
            System.out.println( "Insert "+count+" records!" );
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // delete data
    public  static  void delete() {
        String sql="delete from employee where id=3";
        Connection conn =getConnection();
        try {
            Statement st=conn.createStatement();
            int count =st.executeUpdate(sql);
            System.out.println( "Deleted "+count+" records!" );
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("welcome to employee-jdbc program");
        EmployeeDatabase jdbc = new EmployeeDatabase();
        jdbc.insert();
        jdbc.delete();
    }
}
