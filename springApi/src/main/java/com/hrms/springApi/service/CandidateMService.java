package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.candidate;
import com.hrms.springApi.repository.CandidateMRepository;

@Service
public class CandidateMService {

	@Autowired
	public CandidateMRepository candidateMRepo;
	
	//get all candidates
	public List<candidate>getAllcandidates()
	{
		List<candidate> candidates = new ArrayList<>();
		candidateMRepo.findAll().forEach(candidates::add);
		return candidates;
	}
	 //add candidate
	public candidate addcandidate(candidate Candidate)
	{
		candidateMRepo.save(Candidate);
		 return Candidate;
	}

	
 
	//get single department
 
	public candidate getcandidate(Long candidate_Id) {
		return this.candidateMRepo.findById(candidate_Id).get();
	}
	
	//update candidate
	public candidate updateCandidate(candidate Candidate) {
		return this.candidateMRepo.save(Candidate);
	}
	
	//delete candidate
	public void deleteCandidate(Long candidate_Id) {
		 this.candidateMRepo.deleteById(candidate_Id);
		
	}
	
	 
}
