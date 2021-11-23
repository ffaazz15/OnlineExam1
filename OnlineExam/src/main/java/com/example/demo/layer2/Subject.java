package com.example.demo.layer2;

import java.util.List;


import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Myadmin")
public class Subject {

	
	@Id
	@GeneratedValue
	private int Subject_id;
     private String Subject;
     private int levels;
	
	
	public int getSubject_id() {
		return Subject_id;
	}
	public void setSubject_id(int subject_id) {
		Subject_id = subject_id;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public int getLevels() {
		return levels;
	}
	public void setLevels(int levels) {
		this.levels = levels;
	}
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "sub")
	private List<Subject>subList ;
//	
//	@ManyToOne(cascade = CascadeType.ALL, mappedBy = "que")//one Department has Many Employees
//	private Set<Question> queSet = new HashSet<Question>();
//	private Set<ScoreCard> scorecardSet = new HashSet<ScoreCard>();
	

	}




