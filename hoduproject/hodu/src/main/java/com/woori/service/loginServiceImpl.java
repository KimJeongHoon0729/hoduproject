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
	public userVO logincheck(userVO vo, HttpSession session) {
		// TODO Auto-generated method stub
		userVO vo2 = loginDao.logincheck(vo);
		session.setAttribute("userId", vo2.getUserId());
		return loginDao.logincheck(vo);
	}



	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		session.invalidate();

	}
	
	@Override
	public partnerVO plogincheck(partnerVO pvo, HttpSession psession) {
		// TODO Auto-generated method stub
		
			partnerVO pvo2 = loginDao.plogincheck(pvo);
			psession.setAttribute("partnerId", pvo2.getPartnerId());

			return loginDao.plogincheck(pvo);
	}



	@Override
	public void plogout(HttpSession psession) {
		// TODO Auto-generated method stub
		psession.invalidate();

	}

}
