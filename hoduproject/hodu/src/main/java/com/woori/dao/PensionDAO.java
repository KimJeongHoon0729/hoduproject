package com.woori.dao;

import java.util.List;

import com.woori.domain.PensionVO;
import com.woori.domain.RoomVO;

public interface PensionDAO {

	public List<PensionVO> likeList(PensionVO vo);
	public List<PensionVO> moneyList(PensionVO vo);
	
	public void roomRegister(RoomVO vo);
	
	//room 목록 보기
	public List<RoomVO> RoomList(RoomVO vo);
	//펜션 등록하기
	public void pensionRegister(PensionVO vo);
}
