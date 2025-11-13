package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.springApi.bean.department;

public interface DepartmentRepository extends JpaRepository<department,Long>{
	
}
