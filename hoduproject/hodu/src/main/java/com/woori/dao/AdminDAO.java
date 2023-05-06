package com.woori.dao;

import java.util.List;

import com.woori.domain.UserVO;

public interface AdminDAO {

	// 회원 리스트 출력
	public List<UserVO> userList(UserVO vo);
	
	public UserVO userView(UserVO vo);
	
	
	// 회원 삭제
	public void userDelete(String userId);
}
