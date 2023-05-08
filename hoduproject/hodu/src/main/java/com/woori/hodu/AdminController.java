package com.woori.hodu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.woori.domain.Criteria;
import com.woori.domain.UserCriteria;
import com.woori.domain.UserPageMakerVO;
import com.woori.domain.UserVO;
import com.woori.service.AdminServiceImpl;

@Controller
public class AdminController {
	
	@Inject
	AdminServiceImpl adminService;
	

	@RequestMapping("userList.do")
	public String userList (UserCriteria cri, Model model) {
		
		List<UserVO> userList = adminService.userList(cri);
		model.addAttribute("userList", userList);
		
		int total = adminService.getTotal(cri);
		UserPageMakerVO pageMaker = new UserPageMakerVO(cri, total);
		model.addAttribute("pageMaker", pageMaker);

		return "/admin/userList";
	}
	
	
	
	@RequestMapping("userDelete.do")
	public String userDelete(@RequestParam("userId") String userId) {
		adminService.userDelete(userId);
		return "redirect: userList.do";
	}
	
	
}
