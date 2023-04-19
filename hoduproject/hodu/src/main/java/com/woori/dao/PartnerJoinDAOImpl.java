package com.woori.dao;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.PCriteria;
import com.woori.domain.Criteria;
import com.woori.domain.PartnerVO;
import com.woori.domain.QuestionVO;
import com.woori.domain.ReservationVO;

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
	
	//예약 리스트 출력
	@Override
	public List<ReservationVO> RList(ReservationVO rvo){
		return psqlSession.selectList("partner.RList", rvo);
	}
	@Override
	public ReservationVO RView(int reservation_idx) {
		return psqlSession.selectOne("partner.RView", reservation_idx);
	}
	
	
	//예약 삭제
	@Override
	public void RDelete(int reservation_idx) {
		psqlSession.delete("partner.RDelete", reservation_idx);
	}
	
	//예약 수정
	
	@Override
	public ReservationVO RView2(int reservation_idx) {
		return psqlSession.selectOne("partner.RView", reservation_idx);
	}
	@Override
	public void RUpdate(ReservationVO rvo) {
		psqlSession.update("partner.RUpdate", rvo);
	}
	
	//A 리스트 출력
	@Override
	public List<QuestionVO> AList(PCriteria Pcri){
		return psqlSession.selectList("partner.AList", Pcri);
		
	}
	
	//A 게시판 개수
	@Override
	public int getTotal(PCriteria Pcri) {
		return psqlSession.selectOne("partner.AgetTotal");
	}
	
}