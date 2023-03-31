package com.woori.service;

import javax.servlet.http.HttpSession;

import com.woori.domain.userVO;

public interface UserJoinService {
	
	//로그인
	public userVO logincheck(userVO vo, HttpSession session);
	public void logout(HttpSession session);
	
	public void insertUser(userVO vo);
	public userVO viewProfile(String userId);
	public void editProfile(userVO vo);
	
	// 아이디 중복체크
	public int idCheck(userVO vo);
	public void deleteProfile(String userId, HttpSession session);
	
}
