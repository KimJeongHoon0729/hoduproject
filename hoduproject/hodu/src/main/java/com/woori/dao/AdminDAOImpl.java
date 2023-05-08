package com.woori.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.UserCriteria;
import com.woori.domain.UserVO;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Inject
	private SqlSession adminSession;
	
	@Override
	public List<UserVO> userList(UserCriteria cri) {
		return adminSession.selectList("admin.userList", cri);
	}
	
	@Override
	public int getTotal(UserCriteria cri) {
		return adminSession.selectOne("admin.getTotal");
	}

	
	@Override
	public void userDelete(String userId) {
		adminSession.delete("admin.userDelete", userId);
	}

	
}