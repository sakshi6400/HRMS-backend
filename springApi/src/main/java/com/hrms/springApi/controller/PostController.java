package com.hrms.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.springApi.bean.department;
import com.hrms.springApi.bean.post;
import com.hrms.springApi.service.PostService;

@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class PostController {

	@Autowired
	 
	private PostService postService;

	@GetMapping("/")
	public List<post> getAllposts()
	{
		return postService.getAllposts();
	}
	@PostMapping("/")
	public void addpost(@RequestBody post Post)
	{
		postService.addpost(Post);
	}
	
 

	
	//get single Post
	  @GetMapping("/{post_Id}")
	  public post Post(@PathVariable("post_Id") Long post_Id) {
	      return this.postService.getPost(post_Id);
	  }
		
		 //update Post

	    @PutMapping("/")
	    public ResponseEntity<post>update(@RequestBody post Post) {
	        return ResponseEntity.ok(this.postService.updatePost(Post));
	    }
	    

	    //delete the Post
	    @DeleteMapping("/{post_Id}")
	    public void delete(@PathVariable("post_Id") Long post_Id) {
	        this.postService.deletePost(post_Id);
	    }
}
