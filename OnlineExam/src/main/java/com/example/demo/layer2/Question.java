package com.example.demo.layer2;



import javax.persistence.*;





@Entity
@Table(name="Question")
public class Question {

	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String Answer;
	
	@ManyToOne
	private Subject sub;

	// FK for emp table
	private int Subject_id;
	
	public int getSubject_id() {
		return Subject_id;
	}

	public void setSubject_id(int subject_id) {
		Subject_id = subject_id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String option2) {
		Option2 = option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String option3) {
		Option3 = option3;
	}

	public String getOption4() {
		return Option4;
	}

	public void setOption4(String option4) {
		Option4 = option4;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}


	
}
