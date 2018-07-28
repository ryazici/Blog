package com.yazici.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yazici.entity.Post;
import com.yazici.repository.PostRepository;
import com.yazici.service.PostService;

@Controller
public class PostController {
	
	
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private PostService postService;
	
	
	
	@GetMapping("/post/{postId}")
	public ModelAndView getPost(@PathVariable("postId") String postId) {
	
		Post post=postRepository.findById(Long.parseLong(postId)).get();
		String name=post.getCategory().getName().toString();
		
		ModelAndView mav=new ModelAndView("post-detail");
		
		mav.addObject("post", post );
		mav.addObject("categoryname",name);
	
		
		return mav;
	}
	
	
	@PostMapping(value="/addpost")
	public String handleFormSubmit(@Valid Post post, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			return "admin";
		}
		post=postService.addPost(post);
		
		redirectAttributes.addFlashAttribute("message", "Post created with id :" + post.getId());
		return "redirect:/post/"+post.getId();
	}
	
	
}
