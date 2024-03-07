package com.example.Learn.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResumeMapper {
    public void insertResume(int userId, String companyName, String startTime, String endTime) {
        String sql = "INSERT INTO Resume (user_id, companyName, startTime, endTime) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            stmt.setString(2, companyName);
            stmt.setString(3, startTime);
            stmt.setString(4, endTime);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
