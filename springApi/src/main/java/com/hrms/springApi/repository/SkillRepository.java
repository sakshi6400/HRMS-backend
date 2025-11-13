package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.skill;

@Repository
public interface SkillRepository extends JpaRepository<skill,Long> {

}
