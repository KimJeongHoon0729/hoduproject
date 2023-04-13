package com.woori.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.woori.domain.PartnerVO;
import com.woori.domain.ReservationVO;

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
	
	
	//예약 리스트 출력
	public List<ReservationVO> RList(ReservationVO rvo);
	public ReservationVO RView(int reservation_idx);
}
