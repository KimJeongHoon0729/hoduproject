package com.woori.hodu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartnerController {
	@RequestMapping("partner/list")
	public String plist() {

		
		return "partner/list";
	}
	
	@RequestMapping("partner/reservation")
	public String preservation() {

		
		return "partner/reservation";
	}
	
	@RequestMapping("partner/review")
	public String preview() {

		
		return "partner/review";
	}
	
	@RequestMapping("partner/qna")
	public String pqna() {

		
		return "partner/qna";
	}
	
	@RequestMapping("partner/myPpage")
	public String myPpage() {

		
		return "partner/myPpage/myPpage";
	}
	
	@RequestMapping("partner/myPpage/PreservationList")
	public String my_PreservationList() {
		
		return "partner/myPpage/PreservationList";
	}
	
	@RequestMapping("partner/myPpage/editPProfile")
	public String my_editPProfile() {
		
		return "partner/myPpage/editPProfile";
	}
	
	@RequestMapping("partner/roomRegister")
	public String room_regiter() {

		
		return "partner/roomRegister";
	}
}
