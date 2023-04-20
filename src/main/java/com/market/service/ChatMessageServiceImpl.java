package com.market.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.market.persistence.ChatMessageDAO;


public class ChatMessageServiceImpl implements ChatMessageService {
	
	@Autowired
	private ChatMessageDAO cmdao;

}
