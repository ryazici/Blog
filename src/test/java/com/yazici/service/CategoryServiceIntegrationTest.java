package com.yazici.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.yazici.entity.Category;
import com.yazici.repository.CategoryRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class CategoryServiceIntegrationTest {

	@Mock
	private CategoryRepository categoryRepository;
	
	
	@InjectMocks
	private CategoryService categoryService;
	
	
	@Before
	public void setUp() {
		 MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void contexLoads() throws Exception {
	        assertThat(categoryRepository).isNotNull();
	}
	
	@Test
	public void testAddCategory() {
		
		Category mockCategory = new Category();
		mockCategory.setName("Test Category");
				
		when(categoryRepository.save(any(Category.class))).thenReturn(mockCategory);

		
		Category newCat=categoryService.addCategory(mockCategory);
		
		assertNotNull(newCat);
		assertNotNull(newCat.getCategoryId());
		assertEquals("Test Category", newCat.getName());
		
	}
	
	
	
	
	
}
