package com.velocity.project.operations;

import java.util.Scanner;

import com.velocity.project.entity.Student;

public class StudentRegistration {

	public Student getStudentDetails(int studentId, String firstName, String lastName, String userName, String password, String city,
			String mailId, String mobileNumber) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name >> ");
		firstName = scanner.next();
		System.out.println("Enter the last name >> ");
		lastName = scanner.next();
		System.out.println("Enter the username >> ");
		userName = scanner.next();
		System.out.println("Enter the password >> ");
		password = scanner.next();
		System.out.println("Enter the city >> ");
		city = scanner.next();
		System.out.println("Enter the mail id >> ");
		mailId = scanner.next();
		System.out.println("Enter the mobile number >> ");
		mobileNumber = scanner.next();
		
		return new Student(studentId, firstName, lastName, userName, password, city, mailId, mobileNumber);
	}
}
