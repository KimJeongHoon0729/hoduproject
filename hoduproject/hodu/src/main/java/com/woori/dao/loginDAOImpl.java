package com.woori.dao;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

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

}
