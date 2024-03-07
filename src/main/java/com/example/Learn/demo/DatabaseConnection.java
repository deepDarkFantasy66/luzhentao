package com.example.Learn.HashSet.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://rm-bp1v07637zu0lg7n62o.mysql.rds.aliyuncs.com:26033/db17855813319";
    private static final String USER = "17855813319";
    private static final String PASSWORD = "Hy5!Jm@6419";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}