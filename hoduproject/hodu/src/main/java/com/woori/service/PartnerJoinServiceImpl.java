package com.woori.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.woori.dao.PartnerJoinDAOImpl;
import com.woori.domain.PartnerVO;

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
	

}
