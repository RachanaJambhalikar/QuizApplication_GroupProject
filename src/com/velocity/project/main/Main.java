package com.velocity.project.main;

import java.util.Scanner;

import com.velocity.project.operations.QuestionsFetching;
import com.velocity.project.operations.QuizResult;
import com.velocity.project.operations.StudentLogin;
import com.velocity.project.operations.StudentRegistration;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Quiz-Based Application");
		System.out.println("For user : ");
		System.out.println("1. Student Registration");
		System.out.println("2. Student Login");
		System.out.println("3. Display the list of questions");
		System.out.println("4. Store Quiz result into database");
		System.out.println("5. Display Quiz result");
		System.out.println("For admin : ");
		System.out.println("6. Display all students score as per ascending order");
		System.out.println("7. Fetch student score by using ID");
		System.out.println("8. Add question with 4 options into database");
		System.out.print("Enter your choice: ");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			StudentRegistration.registerStudentDetails();
			break;
		case 2:
			StudentLogin.doStudentLogin();
			break;
		case 3:
			System.out.println("List of questions : ");
			QuestionsFetching.getAllQuestions();
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		default:
			System.out.println("Invalid choice...");
			break;
		}
	}

}
