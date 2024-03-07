package com.example.Learn.demo;

import java.sql.*;

public class UserMapper {
    public int insertUser(String name, int age) {
        String sql = "INSERT INTO User (name, age) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.executeUpdate();
            // 获取生成的ID
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}

