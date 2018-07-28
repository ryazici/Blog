package com.yazici.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yazici.entity.Post;
import com.yazici.repository.PostRepository;

@Controller
public class AppController {

	@Autowired
	private PostRepository postRepository;
	

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/categories")
	public String getCategories() {
		
		return "categories";
	}
	
	@GetMapping("/users")
	public String getUsers() {
		
		return "users";
	}
	
	@GetMapping("/details")
	public String getDetails() {
		
		return "details";
	}
	@GetMapping("/profile")
	public String getProfile() {
		
		return "profile";
	}
	@GetMapping("/settings")
	public String getSettings() {
		
		return "settings";
	}
	
	@GetMapping("/logout-success")
	public String logout() {
		return "login";
	}
	
	@GetMapping({"/"})
	  public String index(@RequestParam(value="page",required=false) Optional<Integer> pagePar,@RequestParam(value="size",required=false) Optional<Integer> sizePar, Model model){
		
		int page=pagePar.orElse(0);
		int size=sizePar.orElse(6);
		
		Pageable pageable=PageRequest.of(page, size);
		Page<Post> posts = postRepository.findAll(PageRequest.of(pageable.getPageNumber(), pageable.getPageSize()));		  
	    model.addAttribute("page", posts);
  
	    return "index";
	  }
	
	

}
