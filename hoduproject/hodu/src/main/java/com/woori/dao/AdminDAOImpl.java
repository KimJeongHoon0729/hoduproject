package com.woori.dao;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


import com.woori.domain.PCriteria;
import com.woori.domain.PartnerVO;
import com.woori.domain.PensionVO;
import com.woori.domain.QnaVO;
import com.woori.domain.ReservationVO;
import com.woori.domain.RoomVO;
import com.woori.domain.UserVO;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Inject
	private SqlSession adminSession;
	
	@Override
	public List<UserVO> userList(UserVO vo) {
		return adminSession.selectList("admin.userList", vo);
	}
	
	@Override
	public UserVO userView(UserVO vo) {
		return adminSession.selectOne("admin.userView", vo);
	}
	
	@Override
	public void userDelete(String userId) {
		adminSession.delete("admin.userDelete", userId);
	}

}