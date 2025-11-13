package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.CandidateMapping;
import com.hrms.springApi.repository.CandidateMappingRepository;

@Service
public class CandidateMappingService {

	@Autowired
	public CandidateMappingRepository candidateMappingRepo;
	public List<CandidateMapping>getAllMappedCandidate()
	{
		List<CandidateMapping> candidateMappings = new ArrayList<>();
		candidateMappingRepo.findAll().forEach(candidateMappings::add);
		return candidateMappings;
	}
	 
	public CandidateMapping addMappedCandidate(CandidateMapping candidateMapping)
	{
		candidateMappingRepo.save(candidateMapping);
		 return candidateMapping;
	}

	public CandidateMapping updateMappedCandidate(String Candidate_Mapping_Id ,CandidateMapping CandidateMapping)
	{
		candidateMappingRepo.save(CandidateMapping);
		 return CandidateMapping;
	}
	
}
