package com.woori.hodu;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.woori.domain.userVO;
import com.woori.service.UserJoinServiceImpl;

@Controller
public class UserJoinController {

		private static final Logger logger = LoggerFactory.getLogger(UserJoinController.class);
		
		@Inject
		UserJoinServiceImpl userJoinService;
		
		@RequestMapping(value="/signin", method=RequestMethod.GET)  //get으로 접근
		public String userJoin(userVO vo) {
			
			
			return "/signin";  // user/list
		}
		
		@RequestMapping(value="/signin", method=RequestMethod.POST)
		public String userJoin2(@ModelAttribute userVO vo) {
			
			userJoinService.insertUser(vo);
			
			return "/signin";  // user/list
		
		}	
		
		@RequestMapping("viewProfile.do")
		public String viewProfile(String userId, Model model) {
			model.addAttribute("user", userJoinService.viewProfile(userId));
			
			return "user/mypage/editProfile";
		}
		
		@RequestMapping("editProfile.do")
		public String editProfile(@ModelAttribute userVO vo) {
			userJoinService.editProfile(vo);
			
			return "user/mypage/mypage";
		}
		
}
