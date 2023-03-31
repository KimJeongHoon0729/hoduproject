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

import com.woori.domain.userVO;
import com.woori.service.UserJoinServiceImpl;

@Controller
public class UserJoinController {

		private static final Logger logger = LoggerFactory.getLogger(UserJoinController.class);
		
		@Inject
		UserJoinServiceImpl userJoinService;
		
		@Inject
		BCryptPasswordEncoder pwdEncoder;
		
		//로그인
		@RequestMapping("login.do")
		public String login() {
			return "login";
		}
		
		@RequestMapping("logincheck.do")
		public ModelAndView logincheck(@ModelAttribute userVO vo, HttpSession session) {
			userVO result = userJoinService.logincheck(vo, session);
			boolean pwdMatch = pwdEncoder.matches(vo.getUserPw(), result.getUserPw());
			ModelAndView mav = new ModelAndView();
			if(result != null && pwdMatch == true ) { //로그인 성공
				mav.setViewName("index");
				mav.addObject("msg", "sucess");
			
			} else { //로그인 실패
				mav.setViewName("login");
				mav.addObject("msg", "fail");
			}
			return mav;
		}
		
		@RequestMapping("logout.do")
		public ModelAndView logout(HttpSession session) {
			userJoinService.logout(session);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			mav.addObject("msg", "logout");
			return mav;
		}
		
		
		@RequestMapping(value="signin.do", method=RequestMethod.GET)  //get으로 접근
		public String userJoin(userVO vo) {
			
			
			return "/signin";  // user/list
		}
		
		
		
		// 회원가입 post
		@RequestMapping(value="signin.do", method = RequestMethod.POST)
		public String userJoin2(userVO vo) {
			int result = userJoinService.idCheck(vo);
			if(result == 1) {
				return "/signin";
			} else if(result == 0) {
				String inputPass = vo.getUserPw();
				String pwd = pwdEncoder.encode(inputPass);
				vo.setUserPw(pwd);
				userJoinService.insertUser(vo);
			}
			
			return "redirect:/";
		}
		
		@RequestMapping("viewProfile.do")
		public String viewProfile(String userId, Model model) {
			model.addAttribute("user", userJoinService.viewProfile(userId));
			
			return "user/mypage/editProfile";
		}
		
		@RequestMapping("editProfile.do")
		public String editProfile(@ModelAttribute userVO vo) {
			String inputPass = vo.getUserPw();
			String pwd = pwdEncoder.encode(inputPass);
			vo.setUserPw(pwd);
			userJoinService.editProfile(vo);
			
			return "user/mypage/mypage";
		}
		
		// 아이디 중복 체크
		@ResponseBody
		@RequestMapping(value="/idCheck", method = RequestMethod.POST)
		public int idCheck(userVO vo) {
			int result = userJoinService.idCheck(vo);
			return result;
		}
		
		@RequestMapping("deleteProfile.do")
		public String deleteProfile(String userId, HttpSession session) {
			userJoinService.deleteProfile(userId, session);
			
			return "redirect:/";
		}
}





