package com.gl.caseStudy4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.caseStudy4.bean.User;

@Service
public class UserService implements UserDao {
	
	@Autowired
	private UserRepository repository;
	

	@Override
	public void userSave(User user) {
		repository.save(user);
	}

	@Override
	public void findUserById(String id) {
		repository.findById(id);

	}

}
