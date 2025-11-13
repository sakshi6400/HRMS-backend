package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.InterviewSchedule;

@Repository
public interface InterviewSRepository extends JpaRepository<InterviewSchedule,Long>  {

}
