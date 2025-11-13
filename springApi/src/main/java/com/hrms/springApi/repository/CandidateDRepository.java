package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.CandidateDetails;

@Repository
public interface CandidateDRepository extends JpaRepository<CandidateDetails,Long>{

}
