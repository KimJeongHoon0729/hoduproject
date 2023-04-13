package com.woori.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.woori.domain.Criteria;
import com.woori.domain.QuestionVO;
import com.woori.domain.UserVO;

public interface UserJoinService {
	
	//로그인
	public UserVO logincheck(UserVO vo, HttpSession session);
	public void logout(HttpSession session);
	
	public void insertUser(UserVO vo);
	public UserVO viewProfile(String userId);
	public void editProfile(UserVO vo);
	
	// 아이디 중복체크
	public int idCheck(UserVO vo);
	public void deleteProfile(String userId, HttpSession session);
	
	//Q 리스트 출력
	public List<QuestionVO> QList(Criteria cri);
	public int getTotal(Criteria cri);
	
	//Q 비밀번호
	public QuestionVO Q_pwCheck(QuestionVO qvo, HttpSession qsession); 
	//Q 글쓰기
	public void Q_insert(QuestionVO qvo);
	//Q 확인
	public QuestionVO QView(int Q_idx, HttpSession session);
}
