package com.woori.hodu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.woori.domain.UserVO;
import com.woori.service.AdminServiceImpl;

@Controller
public class AdminController {
	
	@Inject
	AdminServiceImpl adminService;
	

	@RequestMapping("userList.do")
	public String userList (UserVO vo, Model model) {
		
		List<UserVO> userList = adminService.userList(vo);
		model.addAttribute("userList", userList);

		return "/admin/userList";
	}
	
	@RequestMapping("userView.do")
	public void userView (UserVO vo, Model model) {
		model.addAttribute("userView", adminService.userView(vo));
	}
	
	@RequestMapping("userDelete.do")
	public String userDelete(@RequestParam("userId") String userId) {
		adminService.userDelete(userId);
		return "redirect: userList.do";
	}
	
	
}
