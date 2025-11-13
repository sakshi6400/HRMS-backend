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

import com.hrms.springApi.bean.InterviewSchedule;
import com.hrms.springApi.bean.department;
import com.hrms.springApi.service.InterviewSService;

@RestController
@RequestMapping("/interviewSchedules")
@CrossOrigin("*")
public class InterviewSController {

	@Autowired
	 
	private InterviewSService interviewSService;

	//get InterviewSchedule
	@GetMapping("/")
	public List<InterviewSchedule> getAllinterviewSchedule()
	{
		return interviewSService.getAllinterviewSchedule();
	}
	
	//add InterviewSchedule
	@PostMapping("/")
	public void addinterviewSchedules(@RequestBody InterviewSchedule interviewSchedule)
	{
		interviewSService.addinterviewSchedules(interviewSchedule);
	}
	  //get single InterviewSchedule
@GetMapping("/{interview_Schedule_Id}")
public InterviewSchedule interviewSchedule(@PathVariable("interview_Schedule_Id") Long interview_Schedule_Id) {
    return this.interviewSService.getInterviewSchedule(interview_Schedule_Id);
}
	
	 //update InterviewSchedule

  @PutMapping("/")
  public ResponseEntity<InterviewSchedule> update(@RequestBody InterviewSchedule interviewSchedule) {
      return ResponseEntity.ok(this.interviewSService.updateInterviewSchedule(interviewSchedule));
  }
  

  //delete the InterviewSchedule
  @DeleteMapping("/{interview_Schedule_Id}")
  public void delete(@PathVariable("interview_Schedule_Id") Long interview_Schedule_Id) {
      this.interviewSService.deleteInterviewSchedule(interview_Schedule_Id);
  }
}
