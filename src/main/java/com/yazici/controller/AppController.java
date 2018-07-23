package com.yazici.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {


	
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
	public String adminPage() {
		return "admin";
	}

}
