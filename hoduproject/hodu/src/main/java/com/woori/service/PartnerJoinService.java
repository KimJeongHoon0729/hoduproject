package com.woori.service;

import javax.servlet.http.HttpSession;

import com.woori.domain.PartnerVO;

public interface PartnerJoinService {
	
	//로그인
	public PartnerVO plogincheck(PartnerVO pvo, HttpSession psession);
	public void plogout(HttpSession psession);
	
	public void insertParnter(PartnerVO pvo);
	public PartnerVO viewPProfile(String partnerId);
	public void editPProfile(PartnerVO pvo);
	
	// 아이디 중복체크
	public int pidCheck(PartnerVO pvo);
	public void deletePProfile(String partnerId, HttpSession psession);
	
	
}
