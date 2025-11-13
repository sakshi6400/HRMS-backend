package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.User;


 
@Repository
public interface UserMRepository extends JpaRepository<User,Long>{

	 

	public User findByUsernameAndPassword(String username, String password);
	public  User findByUsername(String username);
	
}
