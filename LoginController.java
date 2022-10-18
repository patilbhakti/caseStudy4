package com.gl.caseStudy4.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.caseStudy4.service.MyUserService;

@RestController
public class LoginController {
	
	@Autowired
	private MyUserService service;
	
	@GetMapping(value="/loginpage")
	 public ModelAndView showLoginPage() {
		 return new ModelAndView("loginPage");
	 }
	
	@GetMapping(value="/errorpage")
	 public ModelAndView showErrorPage() {
		 return new ModelAndView("errorPage");
	 }

}
