package com.woori.hodu;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.woori.domain.partnerVO;
import com.woori.domain.userVO;
import com.woori.service.loginService;

@Controller
@RequestMapping("/")
public class loginController {

	@Inject
	loginService loginService;
	
	@RequestMapping("login.do")
	public String login() {
		return "login";
	}
	
	@RequestMapping("logincheck.do")
	public ModelAndView logincheck(@ModelAttribute userVO vo, HttpSession session) {
		boolean result = loginService.logincheck(vo, session);
		ModelAndView mav = new ModelAndView();
		if(result == true) { //로그인 성공
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
		loginService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("msg", "logout");
		return mav;
	}
	
	@RequestMapping("plogin.do")
	public String plogin() {
		return "login";
	}
	
	@RequestMapping("plogincheck.do")
	public ModelAndView plogincheck(@ModelAttribute partnerVO pvo, HttpSession psession) {
		boolean result = loginService.plogincheck(pvo, psession);
		ModelAndView mav = new ModelAndView();
		if(result == true) { //로그인 성공
			mav.setViewName("index");
			mav.addObject("msg", "sucess");
		
		} else { //로그인 실패
			mav.setViewName("login");
			mav.addObject("msg", "fail");
		}
		return mav;
	}
	
	@RequestMapping("plogout.do")
	public ModelAndView plogout(HttpSession psession) {
		loginService.logout(psession);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("msg", "logout");
		return mav;
	}
}
