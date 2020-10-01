package com.hb.model;

import java.util.Map;
import java.util.Set;

public class ListModel {

	private int id;
	private String question;
	// private List<String> answer;
	private Set<String> answer;

	// private Map<String,String> answer;
	public ListModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	/*
	 * public List<String> getAnswer() { return answer; }
	 * 
	 * public void setAnswer(List<String> answer) { this.answer = answer; }
	 */

	public Set<String> getAnswer() {
		return answer;
	}

	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}

	/*
	 * public Map<String, String> getAnswer() { return answer; }
	 * 
	 * public void setAnswer(Map<String, String> answer) { this.answer = answer; }
	 */
	@Override
	public String toString() {
		return "ListModel [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}

	
}
