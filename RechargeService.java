package com.gl.caseStudy4.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.caseStudy4.bean.Bill;
import com.gl.caseStudy4.bean.Offer;
import com.gl.caseStudy4.dao.BillRepository;
import com.gl.caseStudy4.dao.OfferRepository;

@Service
public class RechargeService {
	@Autowired
	private OfferRepository offerRepo;
	
		
	public List<Offer> findAllOffers() {
		List<Offer> offerList = offerRepo.findAll();
		return offerList;
	}

	public Offer findAOffer(Long id) {
		Offer offer = offerRepo.getById(id);
		return offer;
	}
	
	

}
