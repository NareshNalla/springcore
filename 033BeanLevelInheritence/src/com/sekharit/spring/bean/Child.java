package com.sekharit.spring.bean;

public class Child extends Parent {
	private String badHabits;
	private String knowledge;

	// setters & getters
	public String getBadHabits() {
		return badHabits;
	}

	public void setBadHabits(String badHabits) {
		this.badHabits = badHabits;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}

}
