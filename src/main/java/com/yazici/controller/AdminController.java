package com.yazici.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yazici.auth.UserRepository;
import com.yazici.entity.Post;
import com.yazici.repository.PostRepository;
import com.yazici.service.CategoryService;
import com.yazici.service.PostService;

@Controller
public class AdminController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/admin")
	@PreAuthorize(value="hasRole('ROLE_ADMIN')")
	public String adminPage(@RequestParam(value="page",required=false) Optional<Integer> pagePar,@RequestParam(value="size",required=false) Optional<Integer> sizePar, Model model) {

		int page=pagePar.orElse(0);
		int size=sizePar.orElse(6);
		
		Pageable pageable=PageRequest.of(page, size);
		
		Page<Post> posts = postRepository.findAll(PageRequest.of(pageable.getPageNumber(), pageable.getPageSize()));
		  
		  
		  
		model.addAttribute("post", new Post());
	    model.addAttribute("page", posts);
	    model.addAttribute("postCount",postService.getCount() );
	    model.addAttribute("categoryCount",categoryService.getCategoryCount());
	    model.addAttribute("userCount",userRepository.count());
		model.addAttribute("categories",categoryService.getCategories());
		
		return "admin";
	}
	
}
