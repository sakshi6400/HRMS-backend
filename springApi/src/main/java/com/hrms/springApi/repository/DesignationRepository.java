package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.designation;

@Repository
public interface DesignationRepository extends JpaRepository<designation,Long> {

}
