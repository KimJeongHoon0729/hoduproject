package com.woori.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.woori.domain.pensionVO;

@Repository
public class PensionDAOImpl implements PensionDAO {

	@Inject
	private SqlSession sqlsession;
	
	@Override
	public List<pensionVO> likeList(pensionVO vo) {
		// TODO Auto-generated method stub
		return sqlsession.selectList("pension.likeList", vo);
	}

}
