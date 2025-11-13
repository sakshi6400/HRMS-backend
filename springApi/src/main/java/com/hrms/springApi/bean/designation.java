package com.hrms.springApi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="designation")
public class designation extends Auditable {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)	 
	private long Designation_Id;
	private String Designation_Name;
	@JoinColumn(name="department_id")
	@ManyToOne
    private department Department;
	
		 
public designation(){
}

public designation(long designation_Id, String designation_Name, department department) {
	super();
	Designation_Id = designation_Id;
	Designation_Name = designation_Name;
	Department = department;
}

public long getDesignation_Id() {
	return Designation_Id;
}

public void setDesignation_Id(long designation_Id) {
	Designation_Id = designation_Id;
}

public String getDesignation_Name() {
	return Designation_Name;
}

public void setDesignation_Name(String designation_Name) {
	Designation_Name = designation_Name;
}

public department getDepartment() {
	return Department;
}

public void setDepartment(department department) {
	Department = department;
}


}