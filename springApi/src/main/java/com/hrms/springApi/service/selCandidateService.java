package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.CandidateMapping;
import com.hrms.springApi.bean.selCandidate;
import com.hrms.springApi.repository.CandidateMappingRepository;
import com.hrms.springApi.repository.selCandidateRepository;

@Service
public class selCandidateService {

	@Autowired
	public selCandidateRepository selCandidateRepo;
	public List<selCandidate>getAllselectedCandidate()
	{
		List<selCandidate> selCandidates = new ArrayList<>();
		selCandidateRepo.findAll().forEach(selCandidates::add);
		return selCandidates;
	}
	 
	public selCandidate addselectedCandidate(selCandidate SelCandidate)
	{
		selCandidateRepo.save(SelCandidate);
		 return SelCandidate;
	}

	public selCandidate getSelCandidate(Long selCandidate_Id) {
		   return this.selCandidateRepo.findById(selCandidate_Id).get();

	}

	public selCandidate updateSelCandidate(selCandidate SelCandidate) {
		return this.selCandidateRepo.save(SelCandidate);
	}

	public void deleteSelCandidate(Long selCandidate_Id) {
		 this.selCandidateRepo.deleteById(selCandidate_Id);
		
	}

	 
	
}
