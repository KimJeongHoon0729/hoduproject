package com.woori.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.woori.dao.UserJoinDAOImpl;
import com.woori.domain.userVO;

@Service
public class UserJoinServiceImpl implements UserJoinService {

	@Inject
	UserJoinDAOImpl userJoin;
	
	//로그인
	@Override
	public userVO logincheck(userVO vo, HttpSession session) {
		// TODO Auto-generated method stub
		userVO vo2 = userJoin.logincheck(vo);
		session.setAttribute("userId", vo2.getUserId());
		return userJoin.logincheck(vo);
	}



	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		session.invalidate();

	}
	
	@Override
	public void insertUser(userVO vo) {
		userJoin.insertUser(vo);
	}
	@Override
	public userVO viewProfile(String userId) {
		return userJoin.viewProfile(userId);
	}
	@Override
	public void editProfile(userVO vo) {
		
		userJoin.editProfile(vo);
	}
	
	// 아이디 중복체크
	@Override
	public int idCheck(userVO vo) {
		int result = userJoin.idCheck(vo);
		return result;
	}
	
	@Override
	public void deleteProfile(String userId, HttpSession session) {
		userJoin.deleteProfile(userId);
		session.invalidate();
	}

}
