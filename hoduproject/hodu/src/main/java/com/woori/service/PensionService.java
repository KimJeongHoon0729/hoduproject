package com.woori.service;

import java.util.List;

import com.woori.domain.PensionVO;
import com.woori.domain.RoomVO;

public interface PensionService {
	public List<PensionVO> likeList(PensionVO vo);
	
	public List<PensionVO> moneyList(PensionVO vo);
	
	public void roomRegister(RoomVO vo);
}
