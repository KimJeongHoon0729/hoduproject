package com.woori.hodu;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CommonController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		
		return "index";
	}
	
	@RequestMapping(value = "/p", method = RequestMethod.GET)
	public String phome(Locale locale, Model model) {

		
		return "pindex";
	}
	

	
	@RequestMapping("login")
	public String login() {

		
		return "login";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	@RequestMapping("signin")
	public String signin() {

		
		return "signin";
	}
	
}
