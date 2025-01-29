package com.velocity.project.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.project.database.connection.DatabaseConnection;

public class StudentRegistration {

	public static void registerStudentDetails(){
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the first name >> ");
			String firstName = scanner.next();
			System.out.println("Enter the last name >> ");
			String lastName = scanner.next();
			System.out.println("Enter the username >> ");
			String userName = scanner.next();
			System.out.println("Enter the password >> ");
			String password = scanner.next();
			System.out.println("Enter the city >> ");
			String city = scanner.next();
			System.out.println("Enter the mail id >> ");
			String mailId = scanner.next();
			System.out.println("Enter the mobile number >> ");
			String mobileNumber = scanner.next();

			Connection connection = DatabaseConnection.getConnection();
			String insertStudentData = "INSERT INTO Student (firstName, lastName, userName, password, city, mailId, mobileNumber) VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertStudentData);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, city);
			preparedStatement.setString(6, mailId);
			preparedStatement.setString(7, mobileNumber);

			int inserted = preparedStatement.executeUpdate();
			if (inserted > 0) {
				System.out.println("Student registered successfully!");
			}
			preparedStatement.close();
			connection.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
