package com.yazici.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yazici.entity.Category;
import com.yazici.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public Category addCategory(Category category) {
		
		Category newCategory = categoryRepository.save(category);
		return newCategory;
	}
	
	
	
	public Iterable<Category> getCategories(){
		
		return categoryRepository.findAll();
	}
	
    public long getCategoryCount(){
		
		return categoryRepository.count();
	}
	
}
