package com.yazici.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.yazici.entity.Category;
import com.yazici.service.CategoryService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {CategoryController.class},secure = false)
public class CategoryControllerTest {

	@Autowired
	private MockMvc mockMvc;

	
	@MockBean
	private CategoryService categoryService;
	
	@InjectMocks
	private CategoryController categoryController;
	
	@Before
	public void setUp() {
		 MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAddPost() throws Exception{

		Category mockCategory=new Category();
		mockCategory.setName("Test Category");


		mockMvc
		.perform(post("/addcategory", mockCategory))
		.andExpect(status().isOk())
		.andReturn();
		
		
		
	}
	
}
