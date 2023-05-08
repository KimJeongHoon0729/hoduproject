package com.woori.hodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.woori.domain.AdminCriteria;
import com.woori.domain.AdminPageMakerVO;
import com.woori.domain.CCriteria;
import com.woori.domain.CPageMakerVO;
import com.woori.domain.CommunityVO;
import com.woori.domain.PartnerVO;
import com.woori.domain.UserVO;
import com.woori.service.AdminServiceImpl;
import com.woori.service.PensionServiceImpl;

@Controller
public class AdminController {
	
	@Inject
	AdminServiceImpl adminService;
	
	@Inject
	PensionServiceImpl pensionService;
	

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
	
	
	//커뮤니티 리스트 출력
	@RequestMapping("adminCList.do")
	public String adminCList(CCriteria cri, Model model){
		
		List<CommunityVO> CList = pensionService.CList(cri);
		List<String> reply = new ArrayList<String>(Arrays.asList());
		for(int i =0; i<CList.size();i++) {
			reply.add(i, pensionService.ReplyTotal(CList.get(i).getIndex()));
		}
		model.addAttribute("CList",CList);
		model.addAttribute("Reply", reply);
		
		int total = pensionService.AgetCTotal(cri);
		
		CPageMakerVO cPageMaker = new CPageMakerVO(cri, total);

		model.addAttribute("cPageMaker", cPageMaker);
		
		return "/admin/community";
	}
	
	@RequestMapping("communityDelete.do")
	public String communityDelete(@RequestParam("index") int index) {
		adminService.communityDelete(index);
		return "redirect: adminCList.do?pageNum=1&amount=10";
	}
	
}
