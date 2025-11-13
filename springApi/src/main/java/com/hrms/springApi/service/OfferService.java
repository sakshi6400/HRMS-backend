package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.Offer;
import com.hrms.springApi.repository.OfferRepository;

@Service
public class OfferService {

	@Autowired
	public OfferRepository OfferRepo;
	public List<Offer>getAllOffer()
	{
		List<Offer> Offers = new ArrayList<>();
		OfferRepo.findAll().forEach(Offers::add);
		return Offers;
	}
	 
	public Offer addoffer(Offer offer)
	{
	OfferRepo.save(offer);
		 return offer;
	}

 

	public Offer getOffer(Long offer_Id) {
		   return this.OfferRepo.findById(offer_Id).get();
	}

	public Offer updateOffer(Offer offer) {
		return this.OfferRepo.save(offer);

	}

	public void deleteOffer(Long offer_Id) {
		 this.OfferRepo.deleteById(offer_Id);

		
	}

	 
	
}
