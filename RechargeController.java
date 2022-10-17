package com.gl.caseStudy4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.caseStudy4.bean.Offer;
import com.gl.caseStudy4.dao.RechargeService;

@RestController
public class RechargeController {
	@Autowired
	private RechargeService service;
	
	@GetMapping("/select")
	public ModelAndView showIndexPage() {
		ModelAndView mv = new ModelAndView("selectPage");
		List<Offer> offerList=service.findAll();
		mv.addObject("offerList",offerList);
		return mv;
	}
	
	@GetMapping("/output")
	public ModelAndView showAnOutput(@PathVariable Integer mobileNumber) {
		ModelAndView mv=new ModelAndView("outputPage");
		return mv;
	}

}
