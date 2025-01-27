package com.velocity.project.entity;

public class Choice {
	int Choice;
	char ChoosenOption;
	char correctAnwser;

	public int getChoice() {
		return Choice;
	}

	public char getChoosenOption() {
		return ChoosenOption;
	}

	public char getCorrectAnwser() {
		return correctAnwser;
	}

	public void setChoice(int choice) {
		Choice = choice;
	}

	public void setChoosenOption(char choosenOption) {
		ChoosenOption = choosenOption;
	}

	public void setCorrectAnwser(char correctAnwser) {
		this.correctAnwser = correctAnwser;
	}

	public Choice(int choice, char choosenOption, char correctAnwser) {
		super();
		Choice = choice;
		ChoosenOption = choosenOption;
		this.correctAnwser = correctAnwser;
	}

	@Override
	public String toString() {
		return "Choice [Choice=" + Choice + ", ChoosenOption=" + ChoosenOption + ", correctAnwser=" + correctAnwser
				+ "]";
	}
}
