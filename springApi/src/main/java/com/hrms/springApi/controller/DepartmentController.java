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

import com.hrms.springApi.bean.department;
import com.hrms.springApi.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@CrossOrigin("*")
public class DepartmentController {
	@Autowired
	 
	private DepartmentService departmentService;

	@GetMapping("/")
	public List<department> getAlldepartments()
	{
		return departmentService.getAlldepartments();
	}
	
    //add department
	@PostMapping("/")
	
	public void adddepartment(@RequestBody department Department)
	{
		departmentService.adddepartment(Department);
	}
	
	

	  //get single Department
  @GetMapping("/{department_Id}")
  public department Department(@PathVariable("department_Id") Long department_Id) {
      return this.departmentService.getdept(department_Id);
  }
	
	 //update department

    @PutMapping("/")
    public ResponseEntity<department> update(@RequestBody department Department) {
        return ResponseEntity.ok(this.departmentService.updateDept(Department));
    }
    

    //delete the department
    @DeleteMapping("/{department_Id}")
    public void delete(@PathVariable("department_Id") Long department_Id) {
        this.departmentService.deleteDept(department_Id);
    }
}

