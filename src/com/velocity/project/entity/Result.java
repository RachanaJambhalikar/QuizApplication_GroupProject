package com.velocity.project.entity;

public class Result {

	int studentScore;
	int totalScore;

	public Result(int studentScore, int totalScore) {
		this.studentScore = studentScore;
		this.totalScore = totalScore;
	}

	public int getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "Result [studentScore=" + studentScore + ", totalScore=" + totalScore + "]";
	}
}
