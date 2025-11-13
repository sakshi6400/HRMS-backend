package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.selCandidate;
 

@Repository
public interface selCandidateRepository extends JpaRepository<selCandidate,Long>{

}
