package com.velocity.project.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.project.database.connection.DatabaseConnection;

public class StudentLogin {

    public static void doStudentLogin() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the username >>");
            String userName = scanner.next();
            System.out.println("Enter the password >>");
            String password = scanner.next();

            Connection connection = DatabaseConnection.getConnection();

            String selectStudent = "SELECT * FROM student WHERE userName = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectStudent);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int studentScore = resultSet.getInt("score"); 
                System.out.println("Login successful!");
                System.out.println("Student score is: " + studentScore);
            } else {
                System.out.println("Invalid username or password...");
            }
  
            // System.out.println("Recored fetched successfully ");
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Unexpected error : " + e.getMessage());
        } 
    }
}
