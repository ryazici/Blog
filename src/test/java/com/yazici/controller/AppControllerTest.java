package com.yazici.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = AppController.class,secure = false)
public class AppControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	
	@InjectMocks
	private AppController appController;
	

	
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testIndexPage() throws Exception {
		
		mockMvc.perform(get("/"))
			   .andExpect(status().is(200))
			   .andReturn();
		
	}
	
	
	
	

}
