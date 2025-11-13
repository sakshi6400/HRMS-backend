package com.hrms.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.springApi.bean.UserDetails;
import com.hrms.springApi.bean.department;
import com.hrms.springApi.service.UserDService;

@RestController
@RequestMapping("/userDetails")
@CrossOrigin("*")
public class UserDController {

	@Autowired
	 
	private UserDService userDService;

	@GetMapping("/")
	public List<UserDetails> getAlluserDetails()
	{
		return userDService.getAlluserDetails();
	}
	@PostMapping("/")
	public void adduserDetails(@RequestBody UserDetails userDetails)
	{
		userDService.adduserDetails(userDetails);
	}
	
	@PutMapping("/{User_Details_Id}")
	public void updateuserDetails(@PathVariable String User_Details_Id,@RequestBody UserDetails userDetails)
	{
		userDService.updateuserDetails(User_Details_Id,userDetails);
	}
	
	//get single UserDetails
	  @GetMapping("/{user_Details_Id}")
	  public UserDetails userDetails(@PathVariable("user_Details_Id") Long user_Details_Id) {
	      return this.userDService.getUserDetails(user_Details_Id);
	  }
		
		 //update UserDetails

	    @PutMapping("/")
	    public ResponseEntity<UserDetails> update(@RequestBody UserDetails userDetails) {
	        return ResponseEntity.ok(this.userDService.updateUserDetails(userDetails));
	    }
	    

	    //delete the UserDetails
	    @DeleteMapping("/{user_Details_Id}")
	    public void delete(@PathVariable("user_Details_Id") Long user_Details_Id) {
	        this.userDService.deleteUserDetails(user_Details_Id);
	    }
}
