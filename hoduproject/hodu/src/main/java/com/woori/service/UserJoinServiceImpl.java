package com.woori.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.woori.dao.UserJoinDAOImpl;
import com.woori.domain.Criteria;
import com.woori.domain.PensionVO;
import com.woori.domain.QuestionVO;
import com.woori.domain.UserVO;

@Service
public class UserJoinServiceImpl implements UserJoinService {

	@Inject
	UserJoinDAOImpl userJoin;
	
	//로그인
	@Override
	public UserVO logincheck(UserVO vo, HttpSession session) {
		// TODO Auto-generated method stub
		UserVO vo2 = userJoin.logincheck(vo);
		session.setAttribute("userId", vo2.getUserId());
		return userJoin.logincheck(vo);
	}



	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		session.invalidate();

	}
	
	@Override
	public void insertUser(UserVO vo) {
		userJoin.insertUser(vo);
	}
	@Override
	public UserVO viewProfile(String userId) {
		return userJoin.viewProfile(userId);
	}
	@Override
	public void editProfile(UserVO vo) {
		
		userJoin.editProfile(vo);
	}
	
	// 아이디 중복체크
	@Override
	public int idCheck(UserVO vo) {
		int result = userJoin.idCheck(vo);
		return result;
	}
	
	@Override
	public void deleteProfile(String userId, HttpSession session) {
		userJoin.deleteProfile(userId);
		session.invalidate();
	}

	//Q 리스트 출력
	@Override
	public List<QuestionVO> QList(Criteria cri) {
		// TODO Auto-generated method stub
		return userJoin.QList(cri);
	}
	
	//Q 게시판 개수
	public int getTotal() {
		return userJoin.getTotal();
	}
	//Q 비밀번호
		public QuestionVO Q_pwCheck(QuestionVO qvo, HttpSession qsession) {
			QuestionVO qvo2 = userJoin.Q_pwCheck(qvo);
			qsession.setAttribute("Q_pw", qvo2.getQ_pw());
			qsession.setAttribute("Q_idx", qvo2.getQ_idx());
			return userJoin.Q_pwCheck(qvo2);
		}
}
