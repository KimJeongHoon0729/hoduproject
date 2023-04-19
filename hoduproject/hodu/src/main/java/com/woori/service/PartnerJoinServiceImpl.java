package com.woori.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.woori.dao.PartnerJoinDAOImpl;
import com.woori.domain.PCriteria;
import com.woori.domain.Criteria;
import com.woori.domain.PCriteria;
import com.woori.domain.PartnerVO;
import com.woori.domain.QuestionVO;
import com.woori.domain.ReservationVO;

@Service
public class PartnerJoinServiceImpl implements PartnerJoinService {

	@Inject
	PartnerJoinDAOImpl partnerJoin;
	
	//로그인
	@Override
	public PartnerVO plogincheck(PartnerVO pvo, HttpSession psession) {
		// TODO Auto-generated method stub

		psession.setAttribute("partnerId", pvo.getPartnerId());
		return partnerJoin.plogincheck(pvo);
	}
	//펜션 네임 가져오기
	public String sessionPensionName(String partnerId) {
	
		return partnerJoin.sessionPensionName(partnerId);
	}



	@Override
	public void plogout(HttpSession psession) {
		// TODO Auto-generated method stub
		psession.invalidate();

	}
	
	@Override
	public void insertParnter(PartnerVO pvo) {
		partnerJoin.insertPartner(pvo);
		
	}
	@Override
	public PartnerVO viewPProfile(String partnerId) {
		return partnerJoin.viewPProfile(partnerId);
	}
	@Override
	public void editPProfile(PartnerVO pvo) {
		partnerJoin.editPProfile(pvo);
	}
	
	// 아이디 중복체크
	@Override
	public int pidCheck(PartnerVO pvo) {
		int result = partnerJoin.pidCheck(pvo);
		return result;
	}
	
	@Override
	public void deletePProfile(String partnerId, HttpSession psession) {
		partnerJoin.deletePProfile(partnerId);
		psession.invalidate();
	}
	
	
	//예약 리스트 출력
	@Override
	public List<ReservationVO> RList(ReservationVO rvo){
		return partnerJoin.RList(rvo);
	}
	@Override
	public ReservationVO RView(int reservation_idx) {
		return partnerJoin.RView(reservation_idx);
	}
	
	//예약 삭제
	@Override
	public void RDelete(int reservation_idx) {
		partnerJoin.RDelete(reservation_idx);
	}
	
	//예약 수정
	@Override
	public ReservationVO RView2(int reservation_idx) {
		return partnerJoin.RView(reservation_idx);
	}
	
	@Override
	public void RUpdate(ReservationVO rvo) {
		partnerJoin.RUpdate(rvo);
	}
	
	//A 리스트 출력
	@Override
	public List<QuestionVO> AList(PCriteria Pcri) {
		// TODO Auto-generated method stub
		return partnerJoin.AList(Pcri);
	}
	
	//A 게시판 개수
	@Override
	public int AgetTotal(PCriteria Pcri) {
		return partnerJoin.getTotal(Pcri);
	}
}
