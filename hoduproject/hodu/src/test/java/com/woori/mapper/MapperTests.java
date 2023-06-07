package com.woori.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.woori.dao.PensionDAO;
import com.woori.domain.PensionVO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MapperTests {

	private static final Logger log = LoggerFactory.getLogger(MapperTests.class);
	

	@Autowired
	private PensionDAO pensionDao;
	
	@Test
	public void testAiRecommend() {
		PensionVO vo = new PensionVO();
		
		vo.setDogNum(3);
		
		pensionDao.aiRecommend(vo);
		
		
	}
	
}
