package com.woori.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.woori.dao.AdminDAOImpl;
import com.woori.domain.UserVO;

@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	AdminDAOImpl adminDao;
	
	@Override
	public List<UserVO> userList(UserVO vo) {
		return adminDao.userList(vo);
	}
	
	@Override
	public UserVO userView(UserVO vo) {
		return adminDao.userView(vo);
	}
	
	@Override
	public void userDelete(String userId) {
		adminDao.userDelete(userId);	
	}


}
