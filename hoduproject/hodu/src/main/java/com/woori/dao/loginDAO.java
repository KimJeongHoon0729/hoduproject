package com.woori.dao;

import javax.servlet.http.HttpSession;

import com.woori.domain.partnerVO;
import com.woori.domain.userVO;

public interface loginDAO {
	
	public boolean logincheck(userVO vo);
	public userVO viewUser(userVO vo);
	public void logout(HttpSession session);
	
	public boolean plogincheck(partnerVO pvo);
	public partnerVO viewPartner(partnerVO pvo);
	public void plogout(HttpSession psession);
	
}
