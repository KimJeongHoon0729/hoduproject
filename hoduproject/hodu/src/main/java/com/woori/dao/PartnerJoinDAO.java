package com.woori.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.woori.domain.PCriteria;
import com.woori.domain.PartnerVO;
import com.woori.domain.QnaVO;
import com.woori.domain.ReservationVO;

public interface PartnerJoinDAO {

	//로그인
	public PartnerVO plogincheck(PartnerVO pvo);
	//펜션 네임 가져오기
	public String sessionPensionName(String partnerId);
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
	public List<QnaVO> AList(PCriteria Pcri);
	//A 게시판 개수
	public int AgetTotal(PCriteria Pcri);
	//A 확인
	public QnaVO AView(int Q_idx);
	//A 답변 등록
		public void ARegister(QnaVO vo);
}
