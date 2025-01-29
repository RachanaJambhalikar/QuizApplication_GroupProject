package com.velocity.project.entity;

public class Options {

	int option_Id;
	int qusetion_Id;
	String ChoosenOption;
	String correctAnwser;

	public Options(int option_Id, int qusetion_Id, String choosenOption, String correctAnwser) {
		this.option_Id = option_Id;
		this.qusetion_Id = qusetion_Id;
		ChoosenOption = choosenOption;
		this.correctAnwser = correctAnwser;
	}

	public int getOption_Id() {
		return option_Id;
	}

	public void setOption_Id(int option_Id) {
		this.option_Id = option_Id;
	}

	public int getQusetion_Id() {
		return qusetion_Id;
	}

	public void setQusetion_Id(int qusetion_Id) {
		this.qusetion_Id = qusetion_Id;
	}

	public String getChoosenOption() {
		return ChoosenOption;
	}

	public void setChoosenOption(String choosenOption) {
		ChoosenOption = choosenOption;
	}

	public String getCorrectAnwser() {
		return correctAnwser;
	}

	public void setCorrectAnwser(String correctAnwser) {
		this.correctAnwser = correctAnwser;
	}

	@Override
	public String toString() {
		return "Options [option_Id=" + option_Id + ", qusetion_Id=" + qusetion_Id + ", ChoosenOption=" + ChoosenOption
				+ ", correctAnwser=" + correctAnwser + "]";
	}
}