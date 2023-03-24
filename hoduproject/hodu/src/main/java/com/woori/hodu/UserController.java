package com.woori.hodu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("user/list")
	public String list() {

		
		return "user/list";
	}
	
	@RequestMapping("user/reservation")
	public String reservation() {

		
		return "user/reservation";
	}
	
	@RequestMapping("user/review")
	public String review() {

		
		return "user/review";
	}
	
	@RequestMapping("user/qna")
	public String qna() {

		
		return "user/qna";
	}
	
	@RequestMapping("user/mypage")
	public String mypage() {

		
		return "user/mypage";
	}
	
}
