package com.woori.dao;

import java.util.List;

import com.woori.domain.UserCriteria;
import com.woori.domain.UserVO;

public interface AdminDAO {

	// 회원 리스트 출력
	public List<UserVO> userList(UserCriteria cri);
	
	// 회원 정보 개수
	public int getTotal(UserCriteria cri);
	

	
	// 회원 삭제
	public void userDelete(String userId);

	
}
