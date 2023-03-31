package com.woori.dao;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.partnerVO;

@Repository
public class partnerJoinDAOImpl implements partnerJoinDAO {
	
	@Inject
	SqlSession psqlSession;
	
	//로그인
	@Override
	public partnerVO plogincheck(partnerVO pvo) {
		
		return psqlSession.selectOne("partner.plogin", pvo);
	};

	
	@Override
	public void plogout(HttpSession psession) {
		
	};

	
	@Override
	public void insertPartner(partnerVO pvo) {
		psqlSession.insert("partner.insertPartner", pvo); // 여기서 joinUser는 mapper의 네임스페이스
	}
	
	@Override
	public partnerVO viewPProfile(String partnerId) {
		return psqlSession.selectOne("partner.viewPProfile", partnerId);
	}
	
	@Override
	public void editPProfile(partnerVO pvo) {
		psqlSession.update("partner.editPProfile", pvo);
	}
	
	// 아이디 중복체크
	@Override
	public int pidCheck(partnerVO pvo) {
		int result = psqlSession.selectOne("partner.pidCheck", pvo);
		return result;
	}
	
	@Override
	public void deletePProfile(String partnerId) {
		psqlSession.delete("partner.deletePProfile", partnerId);
	}
	
}
