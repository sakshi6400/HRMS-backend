package com.hrms.springApi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.Role;
 

 
 @Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
	
}