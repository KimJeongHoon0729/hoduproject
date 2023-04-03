package com.woori.dao;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.PartnerVO;

@Repository
public class PartnerJoinDAOImpl implements PartnerJoinDAO {
	
	@Inject
	SqlSession psqlSession;
	
	//로그인
	@Override
	public PartnerVO plogincheck(PartnerVO pvo) {
		
		return psqlSession.selectOne("partner.plogin", pvo);
	};

	
	@Override
	public void plogout(HttpSession psession) {
		
	};

	
	@Override
	public void insertPartner(PartnerVO pvo) {
		psqlSession.insert("partner.insertPartner", pvo); 
	}
	
	@Override
	public PartnerVO viewPProfile(String partnerId) {
		return psqlSession.selectOne("partner.viewPProfile", partnerId);
	}
	
	@Override
	public void editPProfile(PartnerVO pvo) {
		psqlSession.update("partner.editPProfile", pvo);
	}
	
	// 아이디 중복체크
	@Override
	public int pidCheck(PartnerVO pvo) {
		int result = psqlSession.selectOne("partner.pidCheck", pvo);
		return result;
	}
	
	@Override
	public void deletePProfile(String partnerId) {
		psqlSession.delete("partner.deletePProfile", partnerId);
	}
	
}
