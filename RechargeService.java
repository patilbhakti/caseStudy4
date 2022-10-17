package com.gl.caseStudy4.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.caseStudy4.bean.Bill;
import com.gl.caseStudy4.bean.Offer;

@Service
public class RechargeService {
	@Autowired
	private OfferRepository offerRepo;
	
	@Autowired
	private BillRepository billRepo;
	
	public void save(Offer offer) {
		offerRepo.save(offer);	
	}
	
	public Long generateId() {
		Long val=offerRepo.findMaxId();
		if(val==null)
			val=1L;
		else
			val=val+1;
		return val;
	}
	
	public List<Offer> findAll(){
		return offerRepo.findAll();
	}
	
	public void save(Bill bill) {
		billRepo.save(bill);	
	}
	public Long generateTransactionId() {
		Long val=billRepo.findMaxTransactionId();
		if(val==null)
			val=100001L;
		else
			val=val+1;
		return val;
			
	}

}
