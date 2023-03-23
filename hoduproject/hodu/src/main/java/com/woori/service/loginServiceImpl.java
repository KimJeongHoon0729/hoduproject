package com.woori.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.woori.dao.loginDAO;
import com.woori.domain.partnerVO;
import com.woori.domain.userVO;

@Service
public class loginServiceImpl implements loginService {

	@Inject
	loginDAO loginDao;
	
	@Override
	public boolean logincheck(userVO vo, HttpSession session) {
		// TODO Auto-generated method stub
		boolean result = loginDao.logincheck(vo);
		if(result) {
			userVO vo2 = viewUser(vo);
			session.setAttribute("userId", vo2.getUserId());
			session.setAttribute("userName", vo2.getUserName());
			
			
		}
		return result;
	}

	@Override
	public userVO viewUser(userVO vo) {
		// TODO Auto-generated method stub
		return loginDao.viewUser(vo);
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		session.invalidate();

	}
	
	@Override
	public boolean plogincheck(partnerVO pvo, HttpSession psession) {
		// TODO Auto-generated method stub
		boolean result = loginDao.plogincheck(pvo);
		if(result) {
			partnerVO pvo2 = viewPartner(pvo);
			psession.setAttribute("partnerId", pvo2.getPartnerId());
			psession.setAttribute("partnerName", pvo2.getPartnerName());
			
		}
		return result;
	}

	@Override
	public partnerVO viewPartner(partnerVO pvo) {
		// TODO Auto-generated method stub
		return loginDao.viewPartner(pvo);
	}

	@Override
	public void plogout(HttpSession psession) {
		// TODO Auto-generated method stub
		psession.invalidate();

	}

}
