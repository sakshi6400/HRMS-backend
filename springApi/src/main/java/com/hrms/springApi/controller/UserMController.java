package com.hrms.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.springApi.bean.User;
import com.hrms.springApi.helper.UserFoundException;
import com.hrms.springApi.service.UserMService;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserMController {
	
	@Autowired
	 
	public UserMService userMService;
	  @Autowired
	    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@GetMapping("/")
	public List<User> getAllusers()
	{
		return userMService.getAllusers();
	}
	@PostMapping("/")
	public void adduser(@RequestBody User user) throws UserFoundException
	{
		 //encoding password with bcryptpasswordencoder

        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		userMService.adduser(user);
	}
	 
		 
	    

	    //delete the User
	    @DeleteMapping("/{userId}")
	    public void delete(@PathVariable("userId") Long userId) {
	        this.userMService.deleteUser(userId);
	    }
	    
	    
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUsername= user.getUsername();
		String tempPass= user.getPassword();
		User userObj= null;
		if(tempUsername !=null&& tempPass !=null) {
			userObj = userMService.fetchuserByUsernameAndPassword(tempUsername,tempPass);
					 
		}
		if(userObj==null){
			throw new Exception("Inavalid Credentials");
		}
		return userObj;
	}
	
	

}
