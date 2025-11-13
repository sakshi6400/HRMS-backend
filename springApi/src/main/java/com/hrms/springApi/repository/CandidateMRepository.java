package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.candidate;

@Repository
public interface CandidateMRepository extends JpaRepository<candidate,Long>{

}
