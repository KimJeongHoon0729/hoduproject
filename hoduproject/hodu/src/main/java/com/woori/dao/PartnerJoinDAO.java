package com.woori.dao;

import javax.servlet.http.HttpSession;

import com.woori.domain.PartnerVO;

public interface PartnerJoinDAO {

	//로그인
	public PartnerVO plogincheck(PartnerVO pvo);
	public void plogout(HttpSession psession);
	
	public void insertPartner(PartnerVO pvo);
	public PartnerVO viewPProfile(String partnerId);
	public void editPProfile(PartnerVO pvo);
	
	// 아이디 중복체크
	public int pidCheck(PartnerVO pvo);
	
	public void deletePProfile(String partnerId);
	
}
