package com.example.demo.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ScoreCard")
public class StudentLocation {


	@Id
	
	@Column(name="Loc_id")private int Loc_id;
	@Column(name="City")private String City;
	@Column(name="State")private String State;

//
	
	@OneToMany(cascade = CascadeType.ALL, /*fetch = FetchType.EAGER,*/ mappedBy = "loc") //one Department has Many Employees
	private Set<StudentTable> empSet = new HashSet<StudentTable>();
	
public Set<StudentTable> getEmpSet() {
		return empSet;
	}
	public void setEmpSet(Set<StudentTable> empSet) {
		this.empSet = empSet;
	}
public int getLoc_id() {
return Loc_id;
}
public void setLoc_id(int loc_id) {
Loc_id = loc_id;
}
public String getCity() {
return City;
}
public void setCity(String city) {
City = city;
}
public String getState() {
return State;
}
public void setState(String state) {
State = state;
}



}