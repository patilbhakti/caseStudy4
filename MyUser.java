package com.gl.caseStudy4.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
public class MyUser extends User{
	@Id
	private String userId;
	private String userPass;
	
	
	public MyUser() {
		super("Marigold","Mango",new ArrayList<>());
	}
	
	public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String userId,
			String userPass) {
		super(username, password, authorities);
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
