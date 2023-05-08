package com.woori.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.woori.dao.AdminDAOImpl;
import com.woori.domain.UserCriteria;
import com.woori.domain.UserVO;

@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	AdminDAOImpl adminDao;
	
	@Override
	public List<UserVO> userList(UserCriteria cri) {
		return adminDao.userList(cri);
	}
	
	@Override
	public int getTotal(UserCriteria cri) {
		return adminDao.getTotal(cri);
	}
	
	@Override
	public void userDelete(String userId) {
		adminDao.userDelete(userId);	
	}

	


}
