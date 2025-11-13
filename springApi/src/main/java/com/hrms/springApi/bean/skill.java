package com.hrms.springApi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill")
public class skill extends Auditable {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)	 
	private long Skill_Id;
	private String  Skill_Name;
	 
	public skill(){
	}

	public long getSkill_Id() {
		return Skill_Id;
	}

	public void setSkill_Id(long skill_Id) {
		Skill_Id = skill_Id;
	}

	public String getSkill_Name() {
		return Skill_Name;
	}

	public void setSkill_Name(String skill_Name) {
		Skill_Name = skill_Name;
	}

}
