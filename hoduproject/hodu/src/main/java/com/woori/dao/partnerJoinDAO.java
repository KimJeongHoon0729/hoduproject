package com.woori.dao;

import com.woori.domain.partnerVO;

public interface partnerJoinDAO {

	
	public void insertPartner(partnerVO pvo);
	public partnerVO viewPProfile(String partnerId);
	public void editPProfile(partnerVO pvo);
	
	// 아이디 중복체크
	public int pidCheck(partnerVO pvo);
	
	public void deletePProfile(String partnerId);
	
	// 파일 업로드

}
