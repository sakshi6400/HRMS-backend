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

import com.hrms.springApi.bean.Interview;
import com.hrms.springApi.bean.department;
import com.hrms.springApi.service.InterviewService;

@RestController
@RequestMapping("/interviews")
@CrossOrigin("*")
public class InterviewController {
	@Autowired
	 
	private InterviewService interviewService;

	@GetMapping("/")
	public List<Interview> getAllInterviews()
	{
		return interviewService.getAllinterviews();
	}
	@PostMapping("/")
	
	public void addInterview(@RequestBody Interview interview)
	{
		interviewService.addInterview(interview);
	}
	
	 
	

	  //get single Interview
@GetMapping("/{interview_id}")
public Interview interview(@PathVariable("interview_id") Long interview_id) {
    return this.interviewService.getInterview(interview_id);
}
	
	 //update department

  @PutMapping("/")
  public ResponseEntity<Object> update(@RequestBody Interview interview) {
      return ResponseEntity.ok(this.interviewService.updateInterview(interview));
  }
  

  //delete the department
  @DeleteMapping("/{department_Id}")
  public void delete(@PathVariable("interview_id") Long interview_id) {
      this.interviewService.deleteInterview(interview_id);
  }
}
