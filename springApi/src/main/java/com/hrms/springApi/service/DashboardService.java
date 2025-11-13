package com.hrms.springApi.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hrms.springApi.repository.CandidateMRepository;
import com.hrms.springApi.repository.DepartmentRepository;
import com.hrms.springApi.repository.InterviewSRepository;
import com.hrms.springApi.repository.PostRepository;
import com.hrms.springApi.repository.UserMRepository;

@Service
public class DashboardService {
	
	@Autowired
	public DepartmentRepository departmentRepo;
	@Autowired
	public PostRepository postRepo;
	@Autowired
	public UserMRepository userMRepo;
	
	@Autowired
	public InterviewSRepository interviewSRepo;
	
	@Autowired
	public CandidateMRepository candidateMRepo;

	public ResponseEntity<Map<String, Object>> getcount(){
		Map<String, Object> map=new HashMap<>();
		map.put("department", departmentRepo.count());
		map.put("post", postRepo.count());
		map.put("User", userMRepo.count());
		map.put("InterviewSchedule", interviewSRepo.count());
		map.put("candidate", candidateMRepo.count());
		return new ResponseEntity<>(map, HttpStatus.OK);
		
	}

}
