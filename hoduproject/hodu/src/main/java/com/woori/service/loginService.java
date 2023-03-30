package com.woori.service;

import javax.servlet.http.HttpSession;

import com.woori.domain.partnerVO;
import com.woori.domain.userVO;

public interface loginService {

	public userVO logincheck(userVO vo, HttpSession session);
	
	public void logout(HttpSession session);
	
	public partnerVO plogincheck(partnerVO pvo, HttpSession psession);

	public void plogout(HttpSession psession);
}
