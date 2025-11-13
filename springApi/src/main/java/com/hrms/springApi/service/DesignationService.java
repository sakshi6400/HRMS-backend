package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.designation;
import com.hrms.springApi.repository.DesignationRepository;

@Service
public class DesignationService {
	
	@Autowired
	public DesignationRepository designationRepo;
	
	//get all designations
	public List<designation> getAlldesignations()
	{
		List<designation> designations = new ArrayList<>();
		designationRepo.findAll().forEach(designations::add);
		return designations;
	}
	 
	//add designation
	public designation adddesignation(designation Designation)
	{
		 designationRepo.save(Designation);
		 return Designation;
	}

	//update designation
	public designation updatedesignation(String Designation_Id ,designation Designation)
	{
		 designationRepo.save(Designation);
		 return Designation;
	}

	//get single designation
	public designation getDesignation(Long designation_Id) {
		  return this.designationRepo.findById(designation_Id).get();
	}

	//update Designation
	public designation updateDesignation(designation Designation) {
		return this.designationRepo.save(Designation);
	}

	//delete Designation
	public void deleteDesignation(Long designation_Id) {
		this.designationRepo.deleteById(designation_Id);
		
	}
	


}
