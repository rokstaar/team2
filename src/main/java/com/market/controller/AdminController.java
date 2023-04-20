package com.market.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	

	private static final Logger logger 
	             = LoggerFactory.getLogger(AdminController.class);
	
	// http://localhost:8080/admin/adminPage
	@RequestMapping(value = "adminPage",method = RequestMethod.GET)
	public void adminPageGET() {
	}
	
	
	
	
	


}
