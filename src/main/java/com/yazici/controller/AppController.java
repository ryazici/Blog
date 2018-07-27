package com.yazici.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yazici.entity.Category;
import com.yazici.entity.Post;
import com.yazici.repository.CategoryRepository;
import com.yazici.service.CategoryService;

@Controller
public class AppController {

	private CategoryService categoryService;

	
	@Autowired
	public AppController( CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}

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
	
	@GetMapping("/admin")
	@PreAuthorize(value="hasRole('ROLE_ADMIN')")
	public String adminPage(Model model) {

		
		model.addAttribute("post", new Post());
		model.addAttribute("categories",categoryService.getCategories());
		
		return "admin";
	}

}
