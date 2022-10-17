package com.gl.caseStudy4.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.caseStudy4.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findUserByUserId(String userId);

}
