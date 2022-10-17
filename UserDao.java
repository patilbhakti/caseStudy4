package com.gl.caseStudy4.dao;

import com.gl.caseStudy4.bean.User;

public interface UserDao {
	public void userSave(User user);
	public void findUserById(String id);
	

}
