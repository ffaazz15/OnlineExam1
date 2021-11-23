package com.example.demo.layer3;


import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.UserID;



//IF THIS INTERFACE DESIGNED BY THE TEAM LEADER ( WITH GROUP DISCUSSION )
@Repository
public interface UserIdRepo {
	void insertUserDetail(UserID ref);
	UserID selectUser(int S_no); 
	List<UserID> selectAllUsers(); 
	void updateUser(UserID bd); 
	
}















/*
 * 
 * single sequence of hibernate jpa
 * 
 * 	emp			customer		order		product
 * empno		custid			ordid		prodid
 * 121			400				700			9	
 * 122			5				7			10
 * 3			12				8
 * 11							13
 * 
 * 
 *  emp			customer		order		product
 * empno		custid			ordid		prodid
 * 1			1				1			1	
 * 2			2				2			2
 * 3							3
 * 
 */
