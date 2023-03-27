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

		
		return "user/mypage/mypage";
	}
	
	@RequestMapping("user/mypage/reservationList")
	public String my_reservationList() {
		
		return "user/mypage/reservationList";
	}
	
	@RequestMapping("user/mypage/editProfile")
	public String my_editProfile() {
		
		return "user/mypage/editProfile";
	}
}
