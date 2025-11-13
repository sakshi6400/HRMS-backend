package com.hrms.springApi.bean;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="department")

public class department extends Auditable {
	 @GeneratedValue(strategy= GenerationType.AUTO)	 
		@Id
	private long Department_Id;
	private String Department_Name;
	private String Department_Head;
	private String Location;
 
     
    @OneToMany(mappedBy="Department", fetch=FetchType.EAGER)
	@JsonIgnore
     private Set<User>Users=new LinkedHashSet<>();
	
     @OneToMany(mappedBy="Department", fetch=FetchType.EAGER)
 	@JsonIgnore
      private Set<designation>designations=new LinkedHashSet<>();
	public department() {
	 
	}
	public department(long department_Id, String department_Name, String department_Head, String location) {
		super();
		Department_Id = department_Id;
		Department_Name = department_Name;
		Department_Head = department_Head;
		Location = location;
	}
	public long getDepartment_Id() {
		return Department_Id;
	}
	public void setDepartment_Id(long department_Id) {
		Department_Id = department_Id;
	}
	public String getDepartment_Name() {
		return Department_Name;
	}
	public void setDepartment_Name(String department_Name) {
		Department_Name = department_Name;
	}
	public String getDepartment_Head() {
		return Department_Head;
	}
	public void setDepartment_Head(String department_Head) {
		Department_Head = department_Head;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	

}
