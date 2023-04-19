package com.woori.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.woori.domain.PCriteria;
import com.woori.domain.Criteria;
import com.woori.domain.PartnerVO;
import com.woori.domain.PensionVO;
import com.woori.domain.QuestionVO;
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
	
	//예약 삭제
	public void RDelete(int reservation_idx);
	//예약 수정
	public ReservationVO RView2(int reservation_idx);
	public void RUpdate(ReservationVO rvo);
	
	//A 리스트 출력
	public List<QuestionVO> AList(PCriteria Pcri);
	//A 게시판 개수
	public int getTotal(PCriteria Pcri);
}
