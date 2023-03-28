package com.wu.lesson01;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class diyi {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String ur1 = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8";
        String username = "root";
        String password = "55555555";
        Connection connection = DriverManager.getConnection(ur1, username, password);
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM school";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next())
        {
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name="+resultSet.getObject("name"));
        }

        resultSet.close();
        statement.close();
        connection.close();


    }
}
