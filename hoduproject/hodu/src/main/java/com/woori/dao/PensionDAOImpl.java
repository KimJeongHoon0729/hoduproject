package com.woori.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.PensionVO;
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

}
