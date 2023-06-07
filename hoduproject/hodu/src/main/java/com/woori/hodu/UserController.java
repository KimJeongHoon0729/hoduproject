package com.woori.hodu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/reservation")
	public String reservation() {

		
		return "user/reservation";
	}

	@RequestMapping("/review")
	public String review() {

		
		return "user/review";
	}
	
	@RequestMapping("/review_list")
	public String reviewList() {
		return "user/review_list";
	}
	
	@RequestMapping("/qna_list")
	public String qna_list() {

		
		return "user/qna_list";
	}

	
	@RequestMapping("/mypage")
	public String mypage() {

		
		return "user/mypage/mypage";
	}
	
	@RequestMapping("/mypage/reservationList")
	public String my_reservationList() {
		
		return "user/mypage/reservationList";
	}
	@RequestMapping("/mypage/reservationContent_update")
	public String my_reservationListContent_update() {
		
		return "user/mypage/reservationContent_update";
	}
	
	
	@RequestMapping("/mypage/editProfile")
	public String my_editProfile() {
		
		return "user/mypage/editProfile";
	}
	
	@RequestMapping("/list_map")
	public String list_map() {

		
		return "user/list_map";
	}
	@RequestMapping("/list_pension")
	public String list_pension() {

		
		return "user/list_pension";
	}
	
	@RequestMapping("/q_content")
	public String q_content() {

		
		return "user/q_content";
	}
	
	
}
