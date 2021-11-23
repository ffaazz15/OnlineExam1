package com.example.demo.layer2;
//newly made oes


import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="StudentTable10")

public class StudentTable {

@Id

@GeneratedValue(strategy =GenerationType.IDENTITY) 
private long userId;
private String password;
private String fullName;
private String email;
private String phoneNo;
@Temporal(TemporalType.DATE)
private Date dateOfBirth;
private String qualification;
private Date yearOfCompletion;
private int loc_id;
    private String city;
private String state;


@OneToMany(cascade = CascadeType.ALL,mappedBy = "studTable")
private List<Question> queList;

public List<Question> getQueList() {
	return queList;
}
public void setQueList(List<Question> queList) {
	this.queList = queList;
}
public long getUserId() {
return userId;
}
public void setUserId(long userId) {
this.userId = userId;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public String getFullName() {
return fullName;
}
public void setFullName(String fullName) {
this.fullName = fullName;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getPhoneNo() {
return phoneNo;
}
public void setPhoneNo(String phoneNo) {
this.phoneNo = phoneNo;
}
public Date getDateOfBirth() {
return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}
public String getQualification() {
return qualification;
}
public void setQualification(String qualification) {
this.qualification = qualification;
}
public Date getYearOfCompletion() {
return yearOfCompletion;
}
public void setYearOfCompletion(Date yearOfCompletion) {
this.yearOfCompletion = yearOfCompletion;
}
public int getLoc_id() {
return loc_id;
}
public void setLoc_id(int loc_id) {
this.loc_id = loc_id;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}



}