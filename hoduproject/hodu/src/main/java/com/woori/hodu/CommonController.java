package com.woori.hodu;

import java.io.File;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	
	//파일 업로드
	

	@PostMapping("uploadPProfile.do")
	public String fileUpload(@RequestParam("file") MultipartFile businessNum_img, @RequestParam("partnerId") String partnerId, RedirectAttributes redirect ) {
		String filename = "";
		
		if(!businessNum_img.isEmpty()) {
			filename = businessNum_img.getOriginalFilename();
			System.out.println(businessNum_img.getOriginalFilename());
			
			String path = "C:\\Users\\woori\\Documents\\workspace-sts-3.9.18.RELEASE\\.metadata\\.plugins\\org.eclipse.wst.server.core"
					+ "\\tmp2\\wtpwebapps\\spring\\resources\\images\\";
			
			try {
				new File(path).mkdirs(); 
				businessNum_img.transferTo(new File(path+filename));
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		redirect.addAttribute("partnerId", partnerId);
		return "redirect: viewPProfile.do";
	}
	
	
	
}
