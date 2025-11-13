package com.hrms.springApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.springApi.bean.post;

@Repository
public interface PostRepository extends JpaRepository<post,Long> {

}
