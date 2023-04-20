package com.market.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.market.service.ChatMessageService;
import com.market.service.ChatRoomService;

@Controller
public class ChatMessageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChatMessageController.class);
//	
//	@Autowired
//	private ChatRoomService crservice;
//	
//	@Autowired
//	private ChatMessageService cmservice;
	
	@RequestMapping("/chat")
	public String chat() {
		return "chat/myChat";
		
	}
	



}
