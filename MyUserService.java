package com.gl.caseStudy4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.caseStudy4.bean.MyUser;
import com.gl.caseStudy4.dao.MyUserRepository;

@Service
public class MyUserService implements UserDetailsService {
	
	@Autowired
	private MyUserRepository repository;
	

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException{
		return repository.findById(userId).get();
	}
	public void save(MyUser user) {
		repository.save(user);
	}

}
