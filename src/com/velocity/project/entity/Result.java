package com.velocity.project.entity;

public class Result {

	int studentScore;
	final int totalScore = 10;

	public Result(int studentScore) {
		super();
		this.studentScore = studentScore;
	}

	public int getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}

	@Override
	public String toString() {
		return "Result [studentScore=" + studentScore + ", totalScore=" + totalScore + "]";
	}
}
