package com.woori.dao;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.partnerVO;
import com.woori.domain.userVO;

@Repository
public class loginDAOImpl implements loginDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public userVO logincheck(userVO vo) {
		return  sqlSession.selectOne("user.login", vo);
		
	};
	

	@Override
	public void logout(HttpSession session) {
		
	};
	
	@Override
	public partnerVO plogincheck(partnerVO pvo) {
		
		return sqlSession.selectOne("partner.plogin", pvo);
	};
	
	
	
	@Override
	public void plogout(HttpSession psession) {
		
	};

}
