package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.User;
import com.hrms.springApi.helper.UserFoundException;
import com.hrms.springApi.repository.UserMRepository;

@Service
public class UserMService {

	
	@Autowired
	public UserMRepository userMRepo;
public List<User>getAllusers()
{
	List<User> users = new ArrayList<>();
	userMRepo.findAll().forEach(users::add);
	return users;
}
 




public User adduser(User user) throws UserFoundException
{

User local = this.userMRepo.findByUsername(user.getUsername());
if (local != null) {
    System.out.println("User is already there !!");
    throw new UserFoundException();
} else {
    //user create
    

    
    local = this.userMRepo.save(user);

}

return local;
}
	
	
	
 

public User updateuser(String User_Id ,User user) throws UserFoundException
{

	userMRepo.save(user);
	 return user;
	
}
 

public User fetchuserByUsernameAndPassword(String username, String password) {
	// TODO Auto-generated method stub
	return userMRepo.findByUsernameAndPassword(username, password) ;
}





 
 


public void deleteUser(Long userId) {
	 this.userMRepo.deleteById(userId);
	
}
}
