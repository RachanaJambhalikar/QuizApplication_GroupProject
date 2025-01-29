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
		
	    List<Questions> questionsList = new ArrayList<Questions>();
	    PreparedStatement preparedStatement = null;
	    Connection connection = null;
	    try {
	        connection = DatabaseConnection.getConnection();
	       
	        String selectQuestionsTable = "SELECT * FROM Questions";
	        preparedStatement = connection.prepareStatement(selectQuestionsTable);
	        ResultSet resultSet = preparedStatement.executeQuery();

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
	            preparedStatement.close();
	            connection.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return questionsList;
	}
}
