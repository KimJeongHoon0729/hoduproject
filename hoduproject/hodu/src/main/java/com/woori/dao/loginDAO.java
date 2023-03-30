package com.woori.dao;

import javax.servlet.http.HttpSession;

import com.woori.domain.partnerVO;
import com.woori.domain.userVO;

public interface loginDAO {
	
	public userVO logincheck(userVO vo);

	public void logout(HttpSession session);
	
	public partnerVO plogincheck(partnerVO pvo);

	public void plogout(HttpSession psession);
	
}
