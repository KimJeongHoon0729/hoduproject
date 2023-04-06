package com.woori.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.QuestionVO;
import com.woori.domain.UserVO;

@Repository
public class UserJoinDAOImpl implements UserJoinDAO {
	
	@Inject
	SqlSession sqlSession;
	
	//로그인
	@Override
	public UserVO logincheck(UserVO vo) {
		return  sqlSession.selectOne("user.login", vo);	
	};
	

	@Override
	public void logout(HttpSession session) {
		
	};
	
	@Override
	public void insertUser(UserVO vo) {
		sqlSession.insert("user.insertUser", vo); // 여기서 joinUser는 mapper의 네임스페이스
	}
	
	@Override
	public UserVO viewProfile(String userId) {
		return sqlSession.selectOne("user.viewProfile", userId);
	}
	
	@Override
	public void editProfile(UserVO vo) {
		sqlSession.update("user.editProfile", vo);
	}
	
	// 아이디 중복체크
	@Override
	public int idCheck(UserVO vo) {
		int result = sqlSession.selectOne("user.idCheck", vo);
		return result;
	}
	
	@Override
	public void deleteProfile(String userId) {
		sqlSession.delete("user.deleteProfile", userId);
	}
	
	//Q 리스트 출력

	public List<QuestionVO> QList(QuestionVO qvo){
		return sqlSession.selectList("user.question", qvo);
	}
}
