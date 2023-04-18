package com.market.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.market.domain.MemberVO;
import com.market.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO mvo;
	
	@Override
	public MemberVO loginMember(MemberVO vo) {
		
		return mvo.loginMember(vo);
	}
	
}
