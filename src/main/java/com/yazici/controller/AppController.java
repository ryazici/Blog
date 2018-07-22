package com.yazici.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@GetMapping("/postsssss/{id}")
	public String getPost(@PathVariable int id) {
		String viewName="postDetail";
		boolean isPostExists=true;
		
		if(isPostExists)
			return "redirect:/posts";
		
		return viewName;
	}
	
	@GetMapping("/nothing")
	@ResponseBody
	public Object getObjectApi() {
		
		return new Object();
	}



	
	@ModelAttribute
	public void getCommonAtt(Model model ) {
		String messageCommoNModel="This is awaible for the views" ;
		
		model.addAttribute("commonMessage", messageCommoNModel);
		
	}
	
	
	
	
	
}
