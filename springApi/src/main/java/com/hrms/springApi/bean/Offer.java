package com.hrms.springApi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Offer")
public class Offer {

	@GeneratedValue(strategy= GenerationType.AUTO)	 
	@Id
	
	private long Offer_Id;
	private String Offerstatus;
 
	
	@JoinColumn(name="selCandidate_Id")
	@OneToOne 
	 private selCandidate SelCandidate;


 

	public Offer(long offer_Id, String offerstatus, selCandidate selCandidate) {
		super();
		Offer_Id = offer_Id;
		Offerstatus = offerstatus;
		SelCandidate = selCandidate;
	}




	public long getOffer_Id() {
		return Offer_Id;
	}




	public void setOffer_Id(long offer_Id) {
		Offer_Id = offer_Id;
	}




	public String getOfferstatus() {
		return Offerstatus;
	}




	public void setOfferstatus(String offerstatus) {
		Offerstatus = offerstatus;
	}




	public selCandidate getSelCandidate() {
		return SelCandidate;
	}




	public void setSelCandidate(selCandidate selCandidate) {
		SelCandidate = selCandidate;
	}




	public Offer() {
		super();
	}

 
 
	  

}
