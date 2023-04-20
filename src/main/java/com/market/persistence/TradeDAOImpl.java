package com.market.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TradeDAOImpl implements TradeDAO{

	@Inject
	private SqlSession session;
	
	private final String NAMESPACE = "com.itwillbs.mapper.tradeMapper";

	private static final Logger logger = LoggerFactory.getLogger(TradeDAOImpl.class);

}
