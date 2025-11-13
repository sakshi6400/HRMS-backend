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

import com.hrms.springApi.bean.Role;
import com.hrms.springApi.bean.department;
import com.hrms.springApi.service.RoleService;

@RestController
@RequestMapping("/roles")
@CrossOrigin("*")
public class RoleController {
	@Autowired
	 
		private RoleService roleService;

		@GetMapping("/")
		public List<Role> getAllroles()
		{
			return roleService.getAllroles();
		}
		@PostMapping("/")
		public void addrole(@RequestBody Role role)
		{
			roleService.addrole(role);
		}
		 
			 

		    
	}

