package com.woori.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.woori.dao.AdminDAOImpl;
import com.woori.dao.PartnerJoinDAOImpl;
import com.woori.domain.PCriteria;

import com.woori.domain.PartnerVO;
import com.woori.domain.PensionVO;
import com.woori.domain.QnaVO;
import com.woori.domain.ReservationVO;
import com.woori.domain.RoomVO;
import com.woori.domain.UserVO;

@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	AdminDAOImpl admin;
	
	@Override
	public List<UserVO> userList(UserVO vo) {
		return admin.userList(vo);
	}
	
	@Override
	public void userDelete(String userId) {
		admin.userDelete(userId);	
	}
	

}
