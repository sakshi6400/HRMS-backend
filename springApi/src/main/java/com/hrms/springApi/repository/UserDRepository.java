package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.UserDetails;

 
@Repository
public interface UserDRepository extends JpaRepository<UserDetails,Long>{
	
}

