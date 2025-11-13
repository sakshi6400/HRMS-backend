package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.CandidateDetails;
import com.hrms.springApi.bean.department;
import com.hrms.springApi.repository.CandidateDRepository;

@Service
public class CandidateDService {

	@Autowired
	public CandidateDRepository candidateDRepo;
	
	//get candidate details
	public List<CandidateDetails>getAllcandidateDetails()
	{
		List<CandidateDetails> candidateDetails = new ArrayList<>();
		candidateDRepo.findAll().forEach(candidateDetails::add);
		return candidateDetails;
	}
	 
	//add candidate details
	public CandidateDetails addcandidateDetails(CandidateDetails candidateDetails)
	{
		 candidateDRepo.save(candidateDetails);
		 return candidateDetails;
	}

 

	//get candidate details
 
	public CandidateDetails getcandidateDetails(Long candidate_Details_Id) {
		return this.candidateDRepo.findById(candidate_Details_Id).get();
	}

	//update candidate details
	public CandidateDetails updateCandidateDetails(CandidateDetails candidateDetails) {
		return this.candidateDRepo.save(candidateDetails);
	}

	//delete candidate details
	public void deleteCandidateDetails(Long candidate_Details_Id) {
		 this.candidateDRepo.deleteById(candidate_Details_Id);
		
	}

 }
	 

