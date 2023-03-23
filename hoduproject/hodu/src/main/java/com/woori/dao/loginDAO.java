package com.woori.dao;

import javax.servlet.http.HttpSession;

import com.woori.domain.userVO;

public interface loginDAO {
	
	public boolean logincheck(userVO vo);
	public userVO viewUser(userVO vo);
	public void logout(HttpSession session);
	
}
