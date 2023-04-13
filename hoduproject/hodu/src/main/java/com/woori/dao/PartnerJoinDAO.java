package com.woori.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.woori.domain.PartnerVO;
import com.woori.domain.PensionVO;
import com.woori.domain.ReservationVO;

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
	
	//예약 리스트 출력
	public List<ReservationVO> RList(ReservationVO rvo);
	public ReservationVO RView(int reservation_idx);
}
