package com.woori.service;

import javax.servlet.http.HttpSession;

import com.woori.domain.partnerVO;

public interface PartnerJoinService {
	
	//로그인
	public partnerVO plogincheck(partnerVO pvo, HttpSession psession);
	public void plogout(HttpSession psession);
	
	public void insertParnter(partnerVO pvo);
	public partnerVO viewPProfile(String partnerId);
	public void editPProfile(partnerVO pvo);
	
	// 아이디 중복체크
	public int pidCheck(partnerVO pvo);
	public void deletePProfile(String partnerId, HttpSession psession);
	
	
}
