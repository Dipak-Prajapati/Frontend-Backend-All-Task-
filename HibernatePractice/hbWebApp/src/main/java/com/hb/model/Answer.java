package com.hb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OMAnswer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answername;

	/*
	 * @ManyToOne private Question question;
	 * 
	 * public Question getQuestion() { return question; }
	 * 
	 * public void setQuestion(Question question) { this.question = question; }
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answername=" + answername + "]";
	}

}
