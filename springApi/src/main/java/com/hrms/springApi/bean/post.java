package com.hrms.springApi.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class post extends Auditable {
	
	@GeneratedValue(strategy= GenerationType.AUTO)	 
	@Id
private long Post_Id;
private String Post_Name;
private String Job_Type;
private String No_Of_Position;
private String Min_Experience;
private String Job_Description;
private String Location;
private Date Date_Published;
@JoinColumn(name="designation_id")
@OneToOne 
private designation Designation;
 
  
public post()  {
	 
}

public post(long post_Id, String post_Name, String job_Type, String no_Of_Position, String min_Experience,
		String job_Description, String location, Date date_Published, designation designation) {
	super();
	Post_Id = post_Id;
	Post_Name = post_Name;
	Job_Type = job_Type;
	No_Of_Position = no_Of_Position;
	Min_Experience = min_Experience;
	Job_Description = job_Description;
	Location = location;
	Date_Published = date_Published;
	Designation = designation;
}

public long getPost_Id() {
	return Post_Id;
}

public void setPost_Id(long post_Id) {
	Post_Id = post_Id;
}

public String getPost_Name() {
	return Post_Name;
}

public void setPost_Name(String post_Name) {
	Post_Name = post_Name;
}

public String getJob_Type() {
	return Job_Type;
}

public void setJob_Type(String job_Type) {
	Job_Type = job_Type;
}

public String getNo_Of_Position() {
	return No_Of_Position;
}

public void setNo_Of_Position(String no_Of_Position) {
	No_Of_Position = no_Of_Position;
}

public String getMin_Experience() {
	return Min_Experience;
}

public void setMin_Experience(String min_Experience) {
	Min_Experience = min_Experience;
}

public String getJob_Description() {
	return Job_Description;
}

public void setJob_Description(String job_Description) {
	Job_Description = job_Description;
}

public String getLocation() {
	return Location;
}

public void setLocation(String location) {
	Location = location;
}

public Date getDate_Published() {
	return Date_Published;
}

public void setDate_Published(Date date_Published) {
	Date_Published = date_Published;
}

public designation getDesignation() {
	return Designation;
}

public void setDesignation(designation designation) {
	Designation = designation;
}

 
  

}
