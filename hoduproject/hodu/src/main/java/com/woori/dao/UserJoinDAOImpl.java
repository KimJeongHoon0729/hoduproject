package com.woori.dao;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.userVO;

@Repository
public class UserJoinDAOImpl implements UserJoinDAO {
	
	@Inject
	SqlSession sqlSession;
	
	//로그인
	@Override
	public userVO logincheck(userVO vo) {
		return  sqlSession.selectOne("user.login", vo);	
	};
	

	@Override
	public void logout(HttpSession session) {
		
	};
	
	@Override
	public void insertUser(userVO vo) {
		sqlSession.insert("user.insertUser", vo); // 여기서 joinUser는 mapper의 네임스페이스
	}
	
	@Override
	public userVO viewProfile(String userId) {
		return sqlSession.selectOne("user.viewProfile", userId);
	}
	
	@Override
	public void editProfile(userVO vo) {
		sqlSession.update("user.editProfile", vo);
	}
	
	// 아이디 중복체크
	@Override
	public int idCheck(userVO vo) {
		int result = sqlSession.selectOne("user.idCheck", vo);
		return result;
	}
	
	@Override
	public void deleteProfile(String userId) {
		sqlSession.delete("user.deleteProfile", userId);
	}
}
