package com.hrms.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.springApi.bean.Offer;
import com.hrms.springApi.bean.department;
import com.hrms.springApi.service.OfferService;

@RestController
@RequestMapping("/offers")
@CrossOrigin("*")
public class OfferController {
	
	@Autowired
	
	private OfferService offerService;

	@GetMapping("/")
	public List<Offer> getAlloffers()
	{
		return offerService.getAllOffer();
	}
	@PostMapping("/")
	public void addoffer(@RequestBody Offer Offer)
	{
		offerService.addoffer(Offer);
	}
	

	  //get single Offer
@GetMapping("/{offer_Id}")
public Offer offer(@PathVariable("offer_Id") Long offer_Id) {
    return this.offerService.getOffer(offer_Id);
}
	
	 //update Offer

  @PutMapping("/")
  public ResponseEntity<Offer> update(@RequestBody Offer offer) {
      return ResponseEntity.ok(this.offerService.updateOffer(offer));
  }
  

  //delete the Offer
  @DeleteMapping("/{offer_Id}")
  public void delete(@PathVariable("offer_Id") Long offer_Id) {
      this.offerService.deleteOffer(offer_Id);
  }


}
