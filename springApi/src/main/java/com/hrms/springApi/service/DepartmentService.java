package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.springApi.bean.department;
 
import com.hrms.springApi.repository.DepartmentRepository;
import com.hrms.springApi.repository.UserMRepository;
 

@Service
public class DepartmentService {

	@Autowired
	public DepartmentRepository departmentRepo;
	

	
public List<department> getAlldepartments()
{
	List<department> departments = new ArrayList<>();
	departmentRepo.findAll().forEach(departments::add);
	return departments;
}
 
public department adddepartment(department Department)
{
	departmentRepo.save(Department);
	 return Department;
}

public department updatedepartment(String Department_Id ,department Department)
{
	departmentRepo.save(Department);
	 return Department;
}

public   department updateDept(department Department) {
	
	return this.departmentRepo.save(Department);
}
//get single department
public department getdept(Long department_Id) {
	   return this.departmentRepo.findById(department_Id).get();
}

public void deleteDept(Long department_Id) {
	 this.departmentRepo.deleteById(department_Id);
	
}
 
}
