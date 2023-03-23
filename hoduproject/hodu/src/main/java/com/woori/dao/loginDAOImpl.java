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
	public boolean logincheck(userVO vo) {
		String name = sqlSession.selectOne("user.login", vo);
		return(name == null)? false : true;
	};
	
	@Override
	public userVO viewUser(userVO vo) {
		return sqlSession.selectOne("user.viewUser", vo);
	};
	
	@Override
	public void logout(HttpSession session) {
		
	};
	
	@Override
	public boolean plogincheck(partnerVO pvo) {
		String name = sqlSession.selectOne("partner.plogin", pvo);
		return(name == null)? false : true;
	};
	
	@Override
	public partnerVO viewPartner(partnerVO pvo) {
		return sqlSession.selectOne("partner.viewPartner", pvo);
	};
	
	@Override
	public void plogout(HttpSession psession) {
		
	};

}
