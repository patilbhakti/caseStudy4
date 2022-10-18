package com.gl.caseStudy4.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.caseStudy4.bean.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, String> {
	Optional<MyUser> findUserByUserId(String userId);

}
