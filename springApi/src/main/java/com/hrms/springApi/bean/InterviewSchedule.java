package com.hrms.springApi.bean;

import java.time.LocalTime;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="interview_schedule")
public class InterviewSchedule extends Auditable{

	@GeneratedValue(strategy= GenerationType.AUTO)	 
	@Id
	private long Interview_Schedule_Id;
	@JoinColumn(name="post_Id")
	@ManyToOne
	private post Post;
	
	@JoinColumn(name="candidate_Id")
	@ManyToOne 
	private candidate Candidate;
	
	@JoinColumn(name="userId")
	@ManyToOne 
	private User User;
	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	public InterviewSchedule(User user) {
		super();
		User = user;
	}
	private String Interview_Type;
	private String Place;
	private LocalTime STime;
	private Date SDate;
	
	public InterviewSchedule() {
		 
	}

	public InterviewSchedule(long interview_Schedule_Id, post post, candidate candidate, User user,
			String interview_Type, String place, LocalTime sTime, Date sDate) {
		super();
		Interview_Schedule_Id = interview_Schedule_Id;
		Post = post;
		Candidate = candidate;
		User = user;
		Interview_Type = interview_Type;
		Place = place;
		STime = sTime;
		SDate = sDate;
	}

	public long getInterview_Schedule_Id() {
		return Interview_Schedule_Id;
	}

	public void setInterview_Schedule_Id(long interview_Schedule_Id) {
		Interview_Schedule_Id = interview_Schedule_Id;
	}

	public post getPost() {
		return Post;
	}

	public void setPost(post post) {
		Post = post;
	}

	public candidate getCandidate() {
		return Candidate;
	}

	public void setCandidate(candidate candidate) {
		Candidate = candidate;
	}

	public String getInterview_Type() {
		return Interview_Type;
	}

	public void setInterview_Type(String interview_Type) {
		Interview_Type = interview_Type;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public LocalTime getSTime() {
		return STime;
	}

	public void setSTime(LocalTime sTime) {
		STime = sTime;
	}

	public Date getSDate() {
		return SDate;
	}

	public void setSDate(Date sDate) {
		SDate = sDate;
	}
	
	 
}
