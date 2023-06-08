package com.woori.service;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.woori.dao.AIImageDAO;
import com.woori.domain.AIImageVO;

@Repository
public class AIImageServiceImpl implements AIImageService {
	
	@Inject
	AIImageDAO aiImageDAO;

	@Override
	public void aiImageUpload(AIImageVO img) {
		aiImageDAO.aiImageUpload(img);
	}
	
	
}