package com.hrms.springApi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="candidate_mapping")
public class CandidateMapping{

	@GeneratedValue(strategy= GenerationType.AUTO)	 
	@Id
	private long Candidate_Mapping_Id;
	private String Status;
	@JoinColumn(name="designation_Id")
	@OneToOne 
	 private designation Designation;
	@JoinColumn(name="department_Id")
	@OneToOne 
	 private department Department;
	@JoinColumn(name="Candidate_Id")
	@OneToOne 
    private candidate Candidate;
	
	
	public CandidateMapping() {
		
	}


	public CandidateMapping(long candidate_Mapping_Id, String status, designation designation, department department,
			candidate candidate) {
		super();
		Candidate_Mapping_Id = candidate_Mapping_Id;
		Status = status;
		Designation = designation;
		Department = department;
		Candidate = candidate;
	}


	public long getCandidate_Mapping_Id() {
		return Candidate_Mapping_Id;
	}


	public void setCandidate_Mapping_Id(long candidate_Mapping_Id) {
		Candidate_Mapping_Id = candidate_Mapping_Id;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public designation getDesignation() {
		return Designation;
	}


	public void setDesignation(designation designation) {
		Designation = designation;
	}


	public department getDepartment() {
		return Department;
	}


	public void setDepartment(department department) {
		Department = department;
	}


	public candidate getCandidate() {
		return Candidate;
	}


	public void setCandidate(candidate candidate) {
		Candidate = candidate;
	}
	 
	
	
	
	
}
