package com.hrms.springApi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="interview")
public class Interview extends Auditable{
	@GeneratedValue(strategy= GenerationType.AUTO)	 
	@Id
	private long interview_id;
	
	@JoinColumn(name="Interview_Schedule_Id")
	@OneToOne 
	private InterviewSchedule interviewSchedule;
	private String Interview_Status;
	private String Candidate_Status;
	private String Communication_Rating;
	private String Technical_Rating;
	private String Overall_Rating;
	private String Remark;
	
	public Interview() {
	}

	public Interview(long interview_id, InterviewSchedule interviewSchedule, String interview_Status,
			String candidate_Status, String communication_Rating, String technical_Rating, String overall_Rating,
			String remark) {
		super();
		this.interview_id = interview_id;
		this.interviewSchedule = interviewSchedule;
		Interview_Status = interview_Status;
		Candidate_Status = candidate_Status;
		Communication_Rating = communication_Rating;
		Technical_Rating = technical_Rating;
		Overall_Rating = overall_Rating;
		Remark = remark;
	}

	public long getInterview_id() {
		return interview_id;
	}

	public void setInterview_id(long interview_id) {
		this.interview_id = interview_id;
	}

	public InterviewSchedule getInterviewSchedule() {
		return interviewSchedule;
	}

	public void setInterviewSchedule(InterviewSchedule interviewSchedule) {
		this.interviewSchedule = interviewSchedule;
	}

	public String getInterview_Status() {
		return Interview_Status;
	}

	public void setInterview_Status(String interview_Status) {
		Interview_Status = interview_Status;
	}

	public String getCandidate_Status() {
		return Candidate_Status;
	}

	public void setCandidate_Status(String candidate_Status) {
		Candidate_Status = candidate_Status;
	}

	public String getCommunication_Rating() {
		return Communication_Rating;
	}

	public void setCommunication_Rating(String communication_Rating) {
		Communication_Rating = communication_Rating;
	}

	public String getTechnical_Rating() {
		return Technical_Rating;
	}

	public void setTechnical_Rating(String technical_Rating) {
		Technical_Rating = technical_Rating;
	}

	public String getOverall_Rating() {
		return Overall_Rating;
	}

	public void setOverall_Rating(String overall_Rating) {
		Overall_Rating = overall_Rating;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	 
	 
}