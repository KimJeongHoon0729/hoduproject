package com.woori.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.woori.dao.PartnerJoinDAOImpl;
import com.woori.domain.PartnerVO;
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
}
