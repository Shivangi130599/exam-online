package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user_answer")
public class UserAnswer {
	@Id
	@GeneratedValue
	@Column(name = "user_answer_id")
	private int id;
	//private String answerGiven;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public String getAnswerGiven() {
		return answerGiven;
	}
	public void setAnswerGiven(String answerGiven) {
		this.answerGiven = answerGiven;
	}*/

	

}
