package com.woori.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.woori.dao.PensionDAO;
import com.woori.domain.PensionVO;
import com.woori.domain.ReviewVO;
import com.woori.domain.RoomVO;

@Service
public class PensionServiceImpl implements PensionService {
	
	@Inject
	PensionDAO pensionDao;
	
	@Override
	public List<PensionVO> likeList(PensionVO vo) {
		// TODO Auto-generated method stub
		return pensionDao.likeList(vo);
	}

	@Override
	public List<PensionVO> moneyList(PensionVO vo) {
		// TODO Auto-generated method stub
		return pensionDao.moneyList(vo);
	}
	@Override
	public String rating(String pensionName){
		return pensionDao.rating(pensionName);
	}
	@Override
	public String price(String pensionName) {
		return pensionDao.price(pensionName);
	}
	
	@Override
	public void roomRegister(RoomVO vo) {
		pensionDao.roomRegister(vo);
		
	}
	
	//room 목록 보기
	@Override
	public List<RoomVO> RoomList(RoomVO vo){
		return pensionDao.RoomList(vo);
	}
	
	//펜션 등록하기
	public void pensionRegister(PensionVO vo) {
		pensionDao.pensionRegister(vo);
	}
}
