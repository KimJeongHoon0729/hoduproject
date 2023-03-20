package com.woori.hodu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagelinkController {
	@RequestMapping("signin")
	public String signin() {

		
		return "signin";
	}
}
