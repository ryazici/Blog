package com.yazici.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice(assignableTypes= {AppController.class,PostController.class})
public class AppControllerAdvice {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("dd.mm.yyyy");
		format.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,false));

	}
	

}
