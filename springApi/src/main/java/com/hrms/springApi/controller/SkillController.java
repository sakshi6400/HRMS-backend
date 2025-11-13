package com.hrms.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.springApi.bean.skill;
import com.hrms.springApi.service.SkillService;

@RestController
@RequestMapping("/skills")
@CrossOrigin("*")
public class SkillController {
	@Autowired

    private SkillService skillService;

   @GetMapping("/")
   public List<skill> getAllskills()
   {
       return skillService.getAllskills();
   }
   
   @PostMapping("/")
   public void addskill(@RequestBody skill Skill)
   {
	   skillService.addskill(Skill);
   }
   
   @PutMapping("/{Skill_Id}")
   public void updateskill(@PathVariable String Skill_Id,@RequestBody skill Skill)
   {
	   skillService.updateskill(Skill_Id,Skill);
   }


}
