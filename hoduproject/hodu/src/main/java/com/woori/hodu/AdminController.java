package com.woori.hodu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.woori.domain.AdminCriteria;
import com.woori.domain.AdminPageMakerVO;
import com.woori.domain.PartnerVO;
import com.woori.domain.UserVO;
import com.woori.service.AdminServiceImpl;

@Controller
public class AdminController {
	
	@Inject
	AdminServiceImpl adminService;
	

	@RequestMapping("userList.do")
	public String userList (AdminCriteria cri, Model model) {
		
		List<UserVO> userList = adminService.userList(cri);
		model.addAttribute("userList", userList);
		
		int total = adminService.getTotal(cri);
		AdminPageMakerVO pageMaker = new AdminPageMakerVO(cri, total);
		model.addAttribute("pageMaker", pageMaker);

		return "/admin/userList";
	}
	
	
	
	@RequestMapping("userDelete.do")
	public String userDelete(@RequestParam("userId") String userId) {
		adminService.userDelete(userId);
		return "redirect: userList.do";
	}
	
	
	
	@RequestMapping("partnerList.do")
	public String partnerList (AdminCriteria cri, Model model) {
		
		List<PartnerVO> partnerList = adminService.partnerList(cri);
		model.addAttribute("partnerList", partnerList);
		
		int total = adminService.pGetTotal(cri);
		AdminPageMakerVO pageMaker = new AdminPageMakerVO(cri, total);
		model.addAttribute("pageMaker", pageMaker);

		return "/admin/partnerList";
	}
	
	
	
	@RequestMapping("partnerDelete.do")
	public String partnerDelete(@RequestParam("partnerId") String partnerId) {
		adminService.userDelete(partnerId);
		return "redirect: partnerList.do";
	}
	
	
}
