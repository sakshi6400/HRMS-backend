package com.hrms.springApi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="selCandidate")
public class selCandidate{

	@GeneratedValue(strategy= GenerationType.AUTO)	 
	@Id
	private long selCandidate_Id;
	
	@JoinColumn(name="Interview_Schedule_Id")
	@OneToOne 
	private InterviewSchedule interviewSchedule;
	
	public selCandidate() {
		
	}

	public selCandidate(long selCandidate_Id, InterviewSchedule interviewSchedule) {
		super();
		this.selCandidate_Id = selCandidate_Id;
		this.interviewSchedule = interviewSchedule;
	}

	public long getSelCandidate_Id() {
		return selCandidate_Id;
	}

	public void setSelCandidate_Id(long selCandidate_Id) {
		this.selCandidate_Id = selCandidate_Id;
	}

	public InterviewSchedule getInterviewSchedule() {
		return interviewSchedule;
	}

	public void setInterviewSchedule(InterviewSchedule interviewSchedule) {
		this.interviewSchedule = interviewSchedule;
	}

 

	 
	
	
	
	
}
