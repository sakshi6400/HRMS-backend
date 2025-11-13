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

import com.hrms.springApi.bean.CandidateMapping;
import com.hrms.springApi.bean.department;
import com.hrms.springApi.bean.selCandidate;
import com.hrms.springApi.service.CandidateMappingService;
import com.hrms.springApi.service.selCandidateService;

@RestController
@RequestMapping("/selectedCandidates")
@CrossOrigin("*")
public class selCandidateController { 
	@Autowired
	 
	private selCandidateService SelCandidateService;
	@GetMapping("/")
	public List<selCandidate> getAllselectedCandidate()
	{
		return SelCandidateService.getAllselectedCandidate();
	}
	@PostMapping("/")
	public void addselectedCandidate(@RequestBody selCandidate SelCandidate)
	{
		SelCandidateService.addselectedCandidate(SelCandidate);
	}
	
	//get single Department
	  @GetMapping("/{selCandidate_Id}")
	  public selCandidate SelCandidate(@PathVariable("selCandidate_Id") Long selCandidate_Id) {
	      return this.SelCandidateService.getSelCandidate(selCandidate_Id);
	  }
		
		 //update department

	    @PutMapping("/")
	    public ResponseEntity<selCandidate> update(@RequestBody selCandidate SelCandidate) {
	        return ResponseEntity.ok(this.SelCandidateService.updateSelCandidate(SelCandidate));
	    }
	    

	    //delete the department
	    @DeleteMapping("/{selCandidate_Id}")
	    public void delete(@PathVariable("selCandidate_Id") Long selCandidate_Id) {
	        this.SelCandidateService.deleteSelCandidate(selCandidate_Id);
	    }
	 
}
