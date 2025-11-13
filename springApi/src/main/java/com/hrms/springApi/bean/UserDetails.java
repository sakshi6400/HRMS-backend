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
@Table(name="user_details")
public class UserDetails {
	@GeneratedValue(strategy= GenerationType.AUTO)	 
	@Id
	
	private long User_Details_Id;
	
	@JoinColumn(name="userId")
	@OneToOne 
	private User user;
	private String Name;
	private String Father_Name;
	private String Mother_Name;
	private String Last_Name;
	private String Gender;
	private String Citizenship;
	private Date DOB;
	private String Contact_No;
	private String Email_Id;
	private String Qualification;
	private String Address1;
	private String Address2;
	private String Address3;
	
	
	public UserDetails() {
	 
	}


	public UserDetails(long user_Details_Id, User user, String name, String father_Name, String mother_Name,
			String last_Name, String gender, String citizenship, Date dOB, String contact_No, String email_Id,
			String qualification, String address1, String address2, String address3) {
		super();
		User_Details_Id = user_Details_Id;
		this.user = user;
		Name = name;
		Father_Name = father_Name;
		Mother_Name = mother_Name;
		Last_Name = last_Name;
		Gender = gender;
		Citizenship = citizenship;
		DOB = dOB;
		Contact_No = contact_No;
		Email_Id = email_Id;
		Qualification = qualification;
		Address1 = address1;
		Address2 = address2;
		Address3 = address3;
	}


	public long getUser_Details_Id() {
		return User_Details_Id;
	}


	public void setUser_Details_Id(long user_Details_Id) {
		User_Details_Id = user_Details_Id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getFather_Name() {
		return Father_Name;
	}


	public void setFather_Name(String father_Name) {
		Father_Name = father_Name;
	}


	public String getMother_Name() {
		return Mother_Name;
	}


	public void setMother_Name(String mother_Name) {
		Mother_Name = mother_Name;
	}


	public String getLast_Name() {
		return Last_Name;
	}


	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getCitizenship() {
		return Citizenship;
	}


	public void setCitizenship(String citizenship) {
		Citizenship = citizenship;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
		DOB = dOB;
	}


	public String getContact_No() {
		return Contact_No;
	}


	public void setContact_No(String contact_No) {
		Contact_No = contact_No;
	}


	public String getEmail_Id() {
		return Email_Id;
	}


	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}


	public String getQualification() {
		return Qualification;
	}


	public void setQualification(String qualification) {
		Qualification = qualification;
	}


	public String getAddress1() {
		return Address1;
	}


	public void setAddress1(String address1) {
		Address1 = address1;
	}


	public String getAddress2() {
		return Address2;
	}


	public void setAddress2(String address2) {
		Address2 = address2;
	}


	public String getAddress3() {
		return Address3;
	}


	public void setAddress3(String address3) {
		Address3 = address3;
	}
 

}
