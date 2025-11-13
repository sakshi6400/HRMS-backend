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

import com.hrms.springApi.bean.CandidateDetails;
import com.hrms.springApi.bean.department;
import com.hrms.springApi.service.CandidateDService;

@RestController
@RequestMapping("/candidateDetails")
@CrossOrigin("*")
public class CandidateDController {
	@Autowired
	public CandidateDService candidateDService;
	
	//get candidate details
	@GetMapping("/")
	public List<CandidateDetails>getAllcandidateDetails()
	{
		return candidateDService.getAllcandidateDetails();
	}
	
	 //get single candidate Details
    @GetMapping("/{department_Id}")
    public CandidateDetails candidateDetails(@PathVariable("Candidate_Details_Id") Long Candidate_Details_Id) {
        return this.candidateDService.getcandidateDetails(Candidate_Details_Id);
    }
	
    
    //add candidate Details
	@PostMapping("/")
	public void addcandidateDetails(@RequestBody CandidateDetails candidateDetails)
	{
		candidateDService.addcandidateDetails(candidateDetails);
	}
	
	//update candidate details
	  @PutMapping("/")
	    public ResponseEntity<CandidateDetails> update(@RequestBody CandidateDetails candidateDetails) {
	        return ResponseEntity.ok(this.candidateDService.updateCandidateDetails(candidateDetails));
	    }
    
	//delete candidate details
	    @DeleteMapping("/{Candidate_Details_Id}")
	    public void delete(@PathVariable("Candidate_Details_Id") Long Candidate_Details_Id) {
	        this.candidateDService.deleteCandidateDetails(Candidate_Details_Id);
	    }

}
