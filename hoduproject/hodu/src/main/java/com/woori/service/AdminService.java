package com.woori.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.woori.domain.PCriteria;
import com.woori.domain.PartnerVO;
import com.woori.domain.PensionVO;
import com.woori.domain.QnaVO;
import com.woori.domain.ReservationVO;
import com.woori.domain.RoomVO;
import com.woori.domain.UserCriteria;
import com.woori.domain.UserVO;

public interface AdminService {
	
	// 회원 리스트 출력
	public List<UserVO> userList(UserCriteria cri);
	
	// 회원 정보 개수
	public int getTotal(UserCriteria cri);

	public void userDelete(String userId);

}
