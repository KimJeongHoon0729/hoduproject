package com.woori.service;

import javax.servlet.http.HttpSession;

import com.woori.domain.partnerVO;
import com.woori.domain.userVO;

public interface loginService {

	public boolean logincheck(userVO vo, HttpSession session);
	public userVO viewUser(userVO vo);
	public void logout(HttpSession session);
	
	public boolean plogincheck(partnerVO pvo, HttpSession psession);
	public partnerVO viewPartner(partnerVO pvo);
	public void plogout(HttpSession psession);
}
