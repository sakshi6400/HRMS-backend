package com.hrms.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.springApi.bean.CandidateMapping;
import com.hrms.springApi.service.CandidateMappingService;

@RestController
@RequestMapping("/MappedCandidates")
@CrossOrigin("*")
public class CandidateMappingController { 
	@Autowired
	 
	private CandidateMappingService candidateMappingService;
	@GetMapping("/")
	public List<CandidateMapping> getAllMappedCandidate()
	{
		return candidateMappingService.getAllMappedCandidate();
	}
	@PostMapping("/")
	public void addMappedCandidate(@RequestBody CandidateMapping candidateMapping)
	{
		candidateMappingService.addMappedCandidate(candidateMapping);
	}
	
	@PutMapping("/{Candidate_Mapping_Id}")
	public void updateMappedCandidate(@PathVariable String Candidate_Mapping_Id,@RequestBody CandidateMapping candidateMapping)
	{
		candidateMappingService.updateMappedCandidate(Candidate_Mapping_Id,candidateMapping);
	}
}
