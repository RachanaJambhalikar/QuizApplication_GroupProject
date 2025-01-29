package com.velocity.project.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.project.database.connection.DatabaseConnection;
import com.velocity.project.entity.Questions;

public class QuestionsFetching {

	public static List<Questions> getAllQuestions() {
	    List<Questions> questionsList = new ArrayList<>();
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;

	    try {
	        connection = DatabaseConnection.getConnection();
	        if (connection == null) {
	            System.out.println("Connection is null!");
	            return questionsList;
	        }

	        String fetchQuery = "SELECT * FROM Questions";
	        preparedStatement = connection.prepareStatement(fetchQuery);
	        resultSet = preparedStatement.executeQuery();

	        while (resultSet.next()) {
	            int questionId = resultSet.getInt("question_Id");
	            String question = resultSet.getString("question");
	            System.out.println(questionId + ", Question: " + question);
	            
	            Questions questions = new Questions(questionId, question);
	            questionsList.add(questions);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (resultSet != null) resultSet.close();
	            if (preparedStatement != null) preparedStatement.close();
	            if (connection != null) connection.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return questionsList;
	}
}
