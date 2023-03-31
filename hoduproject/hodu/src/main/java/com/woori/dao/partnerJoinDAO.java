package com.woori.dao;

import javax.servlet.http.HttpSession;

import com.woori.domain.partnerVO;

public interface partnerJoinDAO {

	//로그인
	public partnerVO plogincheck(partnerVO pvo);
	public void plogout(HttpSession psession);
	
	public void insertPartner(partnerVO pvo);
	public partnerVO viewPProfile(String partnerId);
	public void editPProfile(partnerVO pvo);
	
	// 아이디 중복체크
	public int pidCheck(partnerVO pvo);
	
	public void deletePProfile(String partnerId);
	
	// 파일 업로드

}
