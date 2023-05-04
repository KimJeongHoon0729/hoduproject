package com.woori.hodu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping("userDelete.do")
	public String userDelete(@RequestParam("userId") String userId, Model model) {
		adminService.userDelete(userId);
		model.addAttribute("userDelete", userId);
		return "redirect: userList.do?pageNum=1&amount=10";
	}
	
}
