package com.woori.service;

import com.woori.domain.userVO;

public interface UserJoinService {
	
	public void insertUser(userVO vo);
	public userVO viewProfile(String userId);
	public void editProfile(userVO vo);
	
	// 아이디 중복체크
	public int idCheck(userVO vo);
	
}
