package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.Role;
 
import com.hrms.springApi.repository.RoleRepository;

@Service

public class RoleService {
	
	@Autowired
	public RoleRepository roleRepo;
public List<Role> getAllroles()
{
	List<Role> roles = new ArrayList<>();
	roleRepo.findAll().forEach(roles::add);
	return roles;
}
 
public Role addrole(Role role)
{
	 roleRepo.save(role);
	 return role;
}

public Role updaterole(String Role_Id ,Role role)
{
	 roleRepo.save(role);
	 return role;
}
 
	
}

