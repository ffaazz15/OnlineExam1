package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Myadmin")
public class Admin {

	@Id
	@Column(name="Admin_id")
private int Admin_id;
	
	@Column(name="password")
private String Password;



public int getAdmin_id() {
return Admin_id;
}
public void setAdmin_id(int admin_id) {
Admin_id = admin_id;
}
public String getPassword() {
return Password;
}
public void setPassword(String password) {
Password = password;
}

}