package com.hrms.springApi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.springApi.service.DashboardService;

 

@RestController
@RequestMapping("/dashboard")
@CrossOrigin("*")
public class DashboardController {
	
	@Autowired
	DashboardService dashboardService;
	@GetMapping(path="/")
	ResponseEntity<Map<String,Object>> getcount(){
		return dashboardService.getcount();
	}
}
