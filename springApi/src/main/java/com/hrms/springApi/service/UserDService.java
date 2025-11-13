package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.UserDetails;
import com.hrms.springApi.repository.UserDRepository;

@Service
public class UserDService {

	@Autowired
	public UserDRepository userDRepo;
	public List<UserDetails>getAlluserDetails()
	{
		List<UserDetails> userDetail = new ArrayList<>();
		userDRepo.findAll().forEach(userDetail::add);
		return userDetail;
	}
	 
	public UserDetails adduserDetails(UserDetails userDetails)
	{
		 userDRepo.save(userDetails);
		 return userDetails;
	}

	public UserDetails updateuserDetails(String User_Details_Id ,UserDetails userDetails)
	{
		 userDRepo.save(userDetails);
		 return userDetails;
	}

	public UserDetails getUserDetails(Long user_Details_Id) {
		   return this.userDRepo.findById(user_Details_Id).get();

	}

	public UserDetails updateUserDetails(UserDetails userDetails) {
		return this.userDRepo.save(userDetails);
	}

	public void deleteUserDetails(Long user_Details_Id) {
		 this.userDRepo.deleteById(user_Details_Id);
		
	}
}
