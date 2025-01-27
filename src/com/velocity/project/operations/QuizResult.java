package com.velocity.project.operations;

import com.velocity.project.entity.Result;

public class QuizResult {

	public Result showResult(int studentScore) {
		
		System.out.println(" Student score >> " + studentScore);	
		return new Result(studentScore);
	}
}
