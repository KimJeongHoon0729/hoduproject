package com.woori.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.woori.dao.UserJoinDAOImpl;
import com.woori.domain.userVO;

@Service
public class UserJoinServiceImpl implements UserJoinService {

	@Inject
	UserJoinDAOImpl userJoin;
	
	@Override
	public void insertUser(userVO vo) {
		userJoin.insertUser(vo);
	}
	

}
