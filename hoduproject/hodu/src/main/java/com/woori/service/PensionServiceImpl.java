package com.woori.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.woori.dao.PensionDAO;
import com.woori.domain.PensionVO;

@Service
public class PensionServiceImpl implements PensionService {
	
	@Inject
	PensionDAO pensionDao;
	
	@Override
	public List<PensionVO> likeList(PensionVO vo) {
		// TODO Auto-generated method stub
		return pensionDao.likeList(vo);
	}

}
