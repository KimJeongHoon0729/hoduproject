package com.woori.service;

import java.util.List;

import com.woori.domain.PensionVO;
import com.woori.domain.ReviewVO;
import com.woori.domain.RoomVO;

public interface PensionService {
	public List<PensionVO> likeList(PensionVO vo);
	public List<PensionVO> moneyList(PensionVO vo);
	public String rating(String pensionName);
	public void roomRegister(RoomVO vo);
	
	//room 목록 보기
	public List<RoomVO> RoomList(RoomVO vo);
	
	//펜션 등록하기
	public void pensionRegister(PensionVO vo);
}
