package com.velocity.project.entity;

public class Questions {

	public int question_Id;
	public String question;

	public Questions(int question_Id, String question) {
		this.question_Id = question_Id;
		this.question = question;
	}

	public int getQuestion_Id() {
		return question_Id;
	}

	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Questions [question_Id=" + question_Id + ", question=" + question + "]";
	}
}
