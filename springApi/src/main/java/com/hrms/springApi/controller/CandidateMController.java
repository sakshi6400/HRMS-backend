package com.hrms.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hrms.springApi.bean.candidate;
import com.hrms.springApi.service.CandidateMService;

@RestController
@RequestMapping("/candidates")
@CrossOrigin("*")
public class CandidateMController {

	@Autowired
	
	private CandidateMService candidateMService;

	//get candidates
	@GetMapping("/")
	public List<candidate> getAllcandidates()
	{
		return candidateMService.getAllcandidates();
	}
	
	  //get single candidates
    @GetMapping("/{department_Id}")
    public candidate Candidate(@PathVariable("Candidate_Id") Long Candidate_Id) {
        return this.candidateMService.getcandidate(Candidate_Id);
    }
	
	//upload resume
	
	@Autowired
 private ObjectMapper mapper;
	
	//add data
	@PostMapping("/")
	public ResponseEntity<?> addcandidate(
			@RequestParam("file")MultipartFile file, 
			@RequestParam("userData") String userData
			)
	{
		//converting  string into json 
		candidate Candidate=null;
		try {
		  Candidate	=mapper.readValue(userData, candidate.class);
		}  
		catch (JsonProcessingException e) {
			 return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Request");
		}
		
		//file save
		//user save
		candidateMService.addcandidate(Candidate);
		return ResponseEntity.ok(Candidate);
		
	}
	
 
	 //update department

    @PutMapping("/")
    public ResponseEntity<candidate> update(@RequestBody candidate Candidate) {
        return ResponseEntity.ok(this.candidateMService.updateCandidate(Candidate));
    }

    //delete the department
    @DeleteMapping("/{Candidate_Id}")
    public void delete(@PathVariable("Candidate_Id") Long Candidate_Id) {
        this.candidateMService.deleteCandidate(Candidate_Id);
    }
	
}
