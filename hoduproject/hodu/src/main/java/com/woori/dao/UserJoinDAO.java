package com.woori.dao;

import javax.servlet.http.HttpSession;

import com.woori.domain.UserVO;

public interface UserJoinDAO {
	
	//로그인
	public UserVO logincheck(UserVO vo);
	public void logout(HttpSession session);
	
	public void insertUser(UserVO vo);
	public UserVO viewProfile(String userId);
	public void editProfile(UserVO vo);
	
	// 아이디 중복체크
	public int idCheck(UserVO vo);
	
	public void deleteProfile(String userId);
}
