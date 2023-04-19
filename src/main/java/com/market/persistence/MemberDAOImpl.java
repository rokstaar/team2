package com.market.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.market.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.itwillbs.mapper.memberMapper";
	@Override
	public MemberVO loginMember(MemberVO vo) {
		
		return sqlSession.selectOne(NAMESPACE+".login",vo);
	}
	

}
