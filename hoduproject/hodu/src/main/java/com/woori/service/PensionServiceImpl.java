package com.woori.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.woori.dao.PensionDAO;
import com.woori.domain.pensionVO;

@Service
public class PensionServiceImpl implements PensionService {
	
	@Inject
	PensionDAO pensionDao;
	
	@Override
	public List<pensionVO> likeList(pensionVO vo) {
		// TODO Auto-generated method stub
		return pensionDao.likeList(vo);
	}

}
