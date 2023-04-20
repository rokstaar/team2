package com.market.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.market.service.AdminServiceImpl;

@Controller
@RequestMapping(value = "/admin/*")
public class AdminController {
	
	@Inject
	private AdminServiceImpl service;

	private static final Logger logger 
	             = LoggerFactory.getLogger(AdminController.class);
	
	// http://localhost:8080/admin/adminPage
	// 모든 회원정보 조회
	@RequestMapping(value = "/adminPage",method = RequestMethod.GET)
	public String adminPageGET(HttpServletRequest request, Model model) throws Exception{
		logger.info(" adminPageGET() 호출 (●'◡'●)(●'◡'●)");
		
		// 서비스 - 회원정보 가져오기
		List memberList = new ArrayList<>();
		if(((String)request.getSession().getAttribute("id")).equals("admin")) memberList = service.memberList();
				
		logger.info(memberList.toString());
		// view 페이지 전달
		model.addAttribute("memberList",memberList);
		
		return "/admin/adminPage";
	}
	
	//모든 상품정보 조회
	@RequestMapping(value = "/manageprod",method = RequestMethod.GET)
	public void manageprodGET(HttpServletRequest request, Model model) throws Exception {
		logger.info(" manageprodGET() 호출 (●'◡'●)(●'◡'●) ");
		
		// 서비스 - 상품정보 가져오기
		List productList = new ArrayList<>();
		if(((String)request.getSession().getAttribute("id")).equals("admin")) productList = service.productList();
		
		logger.info(productList.toString());
		//view 페이지 전달
		model.addAttribute("productList",productList);

	}

}