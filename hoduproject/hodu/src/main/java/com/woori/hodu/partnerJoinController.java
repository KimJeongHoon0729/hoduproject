package com.woori.hodu;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.woori.domain.partnerVO;
import com.woori.service.PartnerJoinServiceImpl;

@Controller
public class partnerJoinController {

		private static final Logger logger = LoggerFactory.getLogger(partnerJoinController.class);
		
		@Inject
		PartnerJoinServiceImpl partnerJoinService;
		
		@Inject
		BCryptPasswordEncoder pwdEncoder;
		
		//로그인
		@RequestMapping("plogin.do")
		public String plogin() {
			return "login";
		}
		
		@RequestMapping("plogincheck.do")
		public ModelAndView plogincheck(@ModelAttribute partnerVO pvo, HttpSession psession) {
			partnerVO presult = partnerJoinService.plogincheck(pvo, psession);
			boolean PpwdMatch = pwdEncoder.matches(pvo.getPartnerPw(), presult.getPartnerPw());
			ModelAndView mav = new ModelAndView();
			if(presult != null && PpwdMatch == true ) { //로그인 성공
				mav.setViewName("pindex");
				mav.addObject("msg", "sucess");
			
			} else { //로그인 실패
				mav.setViewName("login");
				mav.addObject("msg", "fail");
			}
			return mav;
		}
		
		@RequestMapping("plogout.do")
		public ModelAndView plogout(HttpSession psession) {
			partnerJoinService.plogout(psession);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("pindex");
			mav.addObject("msg", "logout");
			return mav;
		}
		
		@RequestMapping(value="psignin.do", method=RequestMethod.GET)  //get으로 접근
		public String PartnerJoin(partnerVO pvo) {
			
			
			return "redirect:/";  // user/list
		}
		
		
		
		// 회원가입 post
		@RequestMapping(value="psignin.do", method = RequestMethod.POST)
		public String partnerJoin2(partnerVO pvo) {
			int result = partnerJoinService.pidCheck(pvo);
			if(result == 1) {
				return "/signin";
			} else if(result == 0) {
				String inputPw = pvo.getPartnerPw();
				String pwd = pwdEncoder.encode(inputPw);
				pvo.setPartnerPw(pwd);
				partnerJoinService.insertParnter(pvo);
			}
			
			return "redirect:/";
		}
		
		@RequestMapping("viewPProfile.do")
		public String viewPProfile(String partnerId, Model pmodel) {
			pmodel.addAttribute("partner", partnerJoinService.viewPProfile(partnerId));
			
			return "partner/myPpage/editPProfile";
		}
		
		@RequestMapping("editPProfile.do")
		public String editPProfile(@ModelAttribute partnerVO pvo) {
			String inputPass = pvo.getPartnerPw();
			String pwd = pwdEncoder.encode(inputPass);
			pvo.setPartnerPw(pwd);
			partnerJoinService.editPProfile(pvo);
			
			return "partner/myPpage/myPpage";
		}
		
		// 아이디 중복 체크
		@ResponseBody
		@RequestMapping(value="/pidCheck", method = RequestMethod.POST)
		public int pidCheck(partnerVO pvo) {
			int result = partnerJoinService.pidCheck(pvo);
			return result;
		}
		
		@RequestMapping("deletePProfile.do")
		public String deletePProfile(String partnerId, HttpSession psession) {
			partnerJoinService.deletePProfile(partnerId, psession);
			
			return "redirect:/";
		}
}





