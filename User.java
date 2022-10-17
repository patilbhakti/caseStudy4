package com.gl.caseStudy4.bean;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String userId;
	private String userPass;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userId, String userPass) {
		super();
		this.userId = userId;
		this.userPass = userPass;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPass=" + userPass + "]";
	}
	

}
