package com.woori.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.CommunityVO;
import com.woori.domain.PensionVO;
import com.woori.domain.ReplyVO;
import com.woori.domain.ReviewVO;
import com.woori.domain.RoomVO;

@Repository
public class PensionDAOImpl implements PensionDAO {

	@Inject
	private SqlSession sqlsession;
	
	@Override
	public List<PensionVO> likeList(PensionVO vo) {
		// TODO Auto-generated method stub
		return sqlsession.selectList("pension.likeList", vo);
	}
	
	@Override
	public List<PensionVO> moneyList(PensionVO vo) {
		// TODO Auto-generated method stub
		return sqlsession.selectList("pension.moneyList", vo);
	}
	@Override
	public String rating(String pensionName){
		return sqlsession.selectOne("pension.AvgRating", pensionName);
	}
	@Override
	public String price(String pensionName) {
		return sqlsession.selectOne("pension.MinPrice", pensionName);
	}

	@Override
	public void roomRegister(RoomVO vo) {
		// TODO Auto-generated method stub
		sqlsession.insert("pension.roomRegister", vo);
	}

	//room 목록 보기
	@Override
	public List<RoomVO> RoomList(RoomVO vo){
		return sqlsession.selectList("pension.RoomList", vo);
	}
	
	//펜션 등록하기
	@Override
	public void pensionRegister(PensionVO vo) {
		sqlsession.insert("pension.pensionRegister", vo);
	}
	
	//커뮤니티 리스트 출력
	@Override
	public List<CommunityVO> CList(CommunityVO vo){
		return sqlsession.selectList("pension.CList", vo);
	}
	@Override
	public CommunityVO CView(int index) {
		return sqlsession.selectOne("pension.CView", index);
	}
	//커뮤니티 입력
	@Override
	public void CInsert(CommunityVO vo) {
		sqlsession.insert("pension.CInsert", vo);
	}
	
	//댓글 입력 및 출력
	@Override
	public void ReplyInsert(ReplyVO vo) {
		sqlsession.insert("pension.ReplyInsert", vo);
	}
	@Override
	public List<ReplyVO> ReplyList(ReplyVO vo){
		return sqlsession.selectList("pension.ReplyList", vo);
	}
	//댓글 수정
	@Override
	public void ReplyUpdate (ReplyVO vo) {
		sqlsession.update("pension.ReplyUpdate", vo);
	}
	
	//댓글 삭제
	@Override
	public void ReplyDelete (int reply_index) {
		sqlsession.delete("pension.ReplyDelete", reply_index);
	}
}
