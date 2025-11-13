package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.Interview;

@Repository
public interface InterviewRepository extends JpaRepository<Interview,Long>{

}
