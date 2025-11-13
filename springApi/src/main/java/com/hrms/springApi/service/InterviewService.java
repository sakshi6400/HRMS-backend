package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.Interview;
import com.hrms.springApi.repository.InterviewRepository;

@Service
public class InterviewService {

 
	@Autowired
	public InterviewRepository interviewRepo;
public List<Interview> getAllinterviews()
{
	List<Interview> Interviews = new ArrayList<>();
	interviewRepo.findAll().forEach(Interviews::add);
	return Interviews;
}
 
public Interview addInterview(Interview interview)
{
	interviewRepo.save(interview);
	 return interview;
}

 

public Interview getInterview(Long interview_id) {
	 return this.interviewRepo.findById(interview_id).get();
}

public void deleteInterview(Long interview_id) {
	 this.interviewRepo.deleteById(interview_id);
	
}

public Object updateInterview(Interview interview) {
	return this.interviewRepo.save(interview);
}
}
