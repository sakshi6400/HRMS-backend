package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.InterviewSchedule;
import com.hrms.springApi.repository.InterviewSRepository;

@Service
public class InterviewSService {

	@Autowired
	public InterviewSRepository interviewSRepo;
	public List<InterviewSchedule>getAllinterviewSchedule()
	{
		List<InterviewSchedule> interviewSchedule = new ArrayList<>();
		interviewSRepo.findAll().forEach(interviewSchedule::add);
		return interviewSchedule;
	}		 
	public InterviewSchedule addinterviewSchedules(InterviewSchedule interviewSchedules)
	{
		interviewSRepo.save(interviewSchedules);
		 return interviewSchedules;
	}
 
	public InterviewSchedule getInterviewSchedule(Long interview_Schedule_Id) {
		  return this.interviewSRepo.findById(interview_Schedule_Id).get();
	}
	public InterviewSchedule updateInterviewSchedule(InterviewSchedule interviewSchedule) {
		return this.interviewSRepo.save(interviewSchedule);

	}
	public void deleteInterviewSchedule(Long interview_Schedule_Id) {
		 this.interviewSRepo.deleteById(interview_Schedule_Id);
	}
	}