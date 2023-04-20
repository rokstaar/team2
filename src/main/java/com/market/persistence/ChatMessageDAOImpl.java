package com.market.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class ChatMessageDAOImpl implements ChatMessageDAO {
	
	@Autowired
	private SqlSession sqlsession;

}
