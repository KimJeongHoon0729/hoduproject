package com.woori.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.AIImageVO;

@Repository
public class AIImageDAOImpl implements AIImageDAO {
	
	@Inject
	SqlSession sqlsession;

	@Override
	public void aiImageUpload(AIImageVO img) {
		sqlsession.insert("ai.aiImageUpload", img);
		
	}
	
	
}