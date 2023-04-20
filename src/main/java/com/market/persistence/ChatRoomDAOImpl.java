package com.market.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChatRoomDAOImpl implements ChatRoomDAO {
	
	@Autowired
	private SqlSession sqlsession;
	

}
