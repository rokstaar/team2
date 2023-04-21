package com.market.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.market.domain.ChatMessageVO;
import com.market.domain.ChatRoomVO;
import com.market.service.ChatMessageService;
import com.market.service.ChatRoomService;

@Controller
public class ChatMessageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChatMessageController.class);
	
	@Autowired
	private ChatRoomService crservice;
	
//	@Autowired
//	private ChatMessageService cmservice;
	
	//http://localhost:8080/main
	
	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public String createChatroom(HttpSession session, Model model, ChatRoomVO crvo) {
		
		String id = (String) session.getAttribute("id");
		
		if(id == null) {
			return "redirect:/members/insert";
		}
		
		crvo.setSeller(id);
		
		
		return "/chat/myChat";
	}
	
	public List<ChatMessageVO> registChatDiaolog(HttpSession session) {
		
		String id = (String) session.getAttribute("id");
		
		
		
		return null;
		
	}
	



}
