package com.velocity.project.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.project.database.connection.DatabaseConnection;
import com.velocity.project.entity.Options;
import com.velocity.project.entity.Questions;

public class OptionsFetching {

	public static Map<Integer, List<Options>> getOptions(Questions questions) {

		Map<Integer, List<Options>> optionMap = new HashMap();
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			connection = DatabaseConnection.getConnection();

			String selectOptions =" SELECT * from Options WHERE question_Id = ?";
			preparedStatement = connection.prepareStatement(selectOptions);
			preparedStatement.setInt(1, questions.getQuestion_Id());
			ResultSet resultSet = preparedStatement.executeQuery();
			
			 while (resultSet.next()) { 
		            int optionId = resultSet.getInt("option_Id");
		            int questionId = resultSet.getInt("question_Id");
		            String givenOption = resultSet.getString("given_Option");
		            String correctOption = resultSet.getString("correct_Option");		        
			
			  Options option = new Options(optionId, questionId, givenOption, correctOption);

              List<Options> optionsList = optionMap.get(questionId);
              if (optionsList == null) {
                  optionsList = new ArrayList<>();
                  optionMap.put(questionId, optionsList);
              }
              optionsList.add(option);
			   }
			 }
		    catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            preparedStatement.close();
		            connection.close();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		return optionMap;
	}
}