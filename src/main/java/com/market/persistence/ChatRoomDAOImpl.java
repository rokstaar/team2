package com.market.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.market.domain.ChatRoomVO;

@Repository
public class ChatRoomDAOImpl implements ChatRoomDAO {
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int selectChatRoom(ChatRoomVO crvo) {
		 return sqlsession.selectOne("chat_room.selectChatRoom", crvo);
	}
	

}
