package com.yazici.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yazici.entity.Category;
import com.yazici.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public String getCategories(Model model) {
		
		model.addAttribute("categories", categoryService.getCategories());
		
		return "categories";
	}
	
	
	@PostMapping(value="/addcategory")
	public String handleFormSubmit(@Valid Category category, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			redirectAttributes.addFlashAttribute("message", "An error occured!" );
			return "categories";
		}
		category=categoryService.addCategory(category);
		
		return "redirect:/categories";
	}
	
}
