package com.hrms.springApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hrms.springApi.bean.department;
import com.hrms.springApi.bean.post;
import com.hrms.springApi.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	public PostRepository postRepo;
	public List<post>getAllposts()
	{
		List<post> posts = new ArrayList<>();
		postRepo.findAll().forEach(posts::add);
		return posts;
	}
	 
	public post addpost(post Post)
	{
		 postRepo.save(Post);
		 return Post;
	}

	public post updatepost(String Post_Id ,post Post)
	{
		postRepo.save(Post);
		 return Post;
	}

	public post getPost(Long post_Id) {
		   return this.postRepo.findById(post_Id).get();

	}

	public post updatePost(post Post) {
		return this.postRepo.save(Post);

	}

	public void deletePost(Long post_Id) {
		 this.postRepo.deleteById(post_Id);
		
	}


}
