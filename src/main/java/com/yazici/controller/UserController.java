package com.yazici.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yazici.auth.UserDetailService;

@Controller
public class UserController {


	@Autowired
	private UserDetailService userDetailService;
	
	@GetMapping("/users")
	public String getCategories(Model model) {
		
		model.addAttribute("users", userDetailService.getAllUsers());
		
		return "users";
	}
	
	
}
