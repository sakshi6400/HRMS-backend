package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.skill;
import com.hrms.springApi.repository.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	public SkillRepository skillRepo;
	public List<skill> getAllskills()
	{
		List<skill> skills = new ArrayList<>();
		skillRepo.findAll().forEach(skills::add);
		return skills;
	}
	 
	public skill addskill(skill Skill)
	{
		 skillRepo.save(Skill);
		 return Skill;
	}

	public skill updateskill(String Skill_Id ,skill Skill)
	{
		 skillRepo.save(Skill);
		 return Skill;
	}
	

}
