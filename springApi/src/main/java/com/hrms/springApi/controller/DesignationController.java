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

import com.hrms.springApi.bean.department;
import com.hrms.springApi.bean.designation;
import com.hrms.springApi.service.DesignationService;

@RestController
@RequestMapping("/designations")
@CrossOrigin("*")
public class DesignationController {
	@Autowired

	        private DesignationService designationService;
	
	//get designation
	       @GetMapping("/")
	       public List<designation> getAlldesignations()
	       {
		       return designationService.getAlldesignations();
	       }
	       
	       //get single designation
	       @GetMapping("/{designation_Id}")
	       public designation Designation(@PathVariable("designation_Id") Long designation_Id) {
	           return this.designationService.getDesignation(designation_Id);
	       }
	       
	     //add designation
	       @PostMapping("/")
	       public void adddesignation(@RequestBody designation Designation)
	       {
		        designationService.adddesignation(Designation);
	       }
	       
	       //update designation

	       @PutMapping("/")
	       public ResponseEntity<designation> update(@RequestBody designation Designation) {
	           return ResponseEntity.ok(this.designationService.updateDesignation(Designation));
	       }
	       

	       //delete the designation
	       @DeleteMapping("/{designation_Id}")
	       public void delete(@PathVariable("designation_Id") Long designation_Id) {
	           this.designationService.deleteDesignation(designation_Id);
	       }

	
	}


