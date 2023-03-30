package com.woori.hodu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.woori.domain.pensionVO;
import com.woori.service.PensionService;

@Controller
public class PensionController {
	
	@Inject
	private PensionService pensionService;
	
	@RequestMapping("likeList.do")
	public String likeList(pensionVO vo, Model model) {
		
		List<pensionVO> likeList = pensionService.likeList(vo);
		model.addAttribute("likeList",likeList);
		
		return "user/list";
	}

}
