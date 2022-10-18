package com.gl.caseStudy4.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.caseStudy4.bean.Bill;
import com.gl.caseStudy4.bean.Offer;
import com.gl.caseStudy4.service.BillService;
import com.gl.caseStudy4.service.RechargeService;

@RestController
public class RechargeController {
	@Autowired
	private RechargeService rechargeService;
	
	@Autowired
	private BillService billService;
	
	@GetMapping("/index")
	public ModelAndView showIndexPage() {
		ModelAndView mv = new ModelAndView("index");
		List<Offer> offerList=rechargeService.findAllOffers();
		mv.addObject("offerList",offerList);
		return mv;
	}
	@GetMapping("bill")
	public ModelAndView showBill(@RequestParam("mobileNumber") String mobileNumber, @RequestParam("radio") Long id) {
		ModelAndView mv = new ModelAndView("billView");
		Offer resOffer = rechargeService.findAOffer(id);
		Long transactionId = billService.generateId();
		mv.addObject("resOffer", resOffer);
		mv.addObject("mobileNumber", mobileNumber);
		mv.addObject("transactionId", transactionId);
		
		Bill bill = new Bill();
		bill.setMobileNumber(Integer.parseInt(mobileNumber));
		bill.setOfferId(id);
		bill.setTransactionId(transactionId);
		
		billService.billSave(bill);
		return mv;
	}

}
