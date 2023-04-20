package com.market.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.market.domain.AuctionVO;

@Repository
public class AuctionDAOImpl implements AuctionDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.market.mapper.auctionMapper";

	@Override
	public List<AuctionVO> getAList() throws Exception {
		return sqlSession.selectList(NAMESPACE + ".getAList");
	}

	@Override
	public AuctionVO nowBest() throws Exception {
		return sqlSession.selectOne(NAMESPACE + ".nowBest");
	}

	@Override
	public Integer registerAuction() throws Exception {
		return null;
	}
	
	
	
	
}
