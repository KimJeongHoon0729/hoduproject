package com.woori.hodu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("user/pensionlist")
	public String pensionList() {

		
		return "user/pensionlist";
	}
	
	@RequestMapping("user/reviewlist")
	public String reviewList() {

		
		return "user/reviewlist";
	}
	
	@RequestMapping("user/reviewwrite")
	public String reviewWrite() {

		
		return "user/reviewwrite";
	}
	
	@RequestMapping("user/reviewupdate")
	public String reviewUpdate() {

		
		return "user/reviewupdate";
	}
	
	@RequestMapping("user/reviewdelete")
	public String reviewDelete() {

		
		return "user/reviewDelete";
	}
	
}
