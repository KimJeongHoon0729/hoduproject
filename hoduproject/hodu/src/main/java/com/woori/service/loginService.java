package com.woori.service;

import javax.servlet.http.HttpSession;

import com.woori.domain.userVO;

public interface loginService {

	public boolean logincheck(userVO vo, HttpSession session);
	public userVO viewUser(userVO vo);
	public void logout(HttpSession session);
}
