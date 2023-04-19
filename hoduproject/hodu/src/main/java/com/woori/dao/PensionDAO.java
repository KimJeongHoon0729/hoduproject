package com.woori.dao;

import java.util.List;

import com.woori.domain.PensionVO;
import com.woori.domain.RoomVO;

public interface PensionDAO {

	public List<PensionVO> likeList(PensionVO vo);
	public List<PensionVO> moneyList(PensionVO vo);
	
	public void roomRegister(RoomVO vo);
}
