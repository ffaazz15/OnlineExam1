package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ScoreCard")
public class ScoreCard {

	
	
	
	
	
	@Column(name="Email")private String Email;
	
	@ManyToOne           //many to one connection to subject table 
	@JoinColumn(name="Subject_id") // FK for emp table
	private Subject subject;
	
	@Column(name="score")private int score;
	@Column(name="Date_of_Exam")private LocalDate Date_of_Exam;
	@Column(name="Status")private String Status;
	
	
	

	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public LocalDate getDate_of_Exam() {
		return Date_of_Exam;
	}
	public void setDate_of_Exam(LocalDate date_of_Exam) {
		Date_of_Exam = date_of_Exam;
	}
	
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	

	
}
