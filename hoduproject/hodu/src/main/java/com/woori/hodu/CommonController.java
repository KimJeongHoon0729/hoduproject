package com.woori.hodu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.woori.domain.PensionVO;

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
	
	@RequestMapping("community")
	public String community() {

		
		return "community";
	}
	
	@RequestMapping("community_content")
	public String community_content() {

		
		return "community_content";
	}
	@RequestMapping("community_form")
	public String community_form() {

		
		return "community_form";
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
	
	
	//�뙆�씪 �뾽濡쒕뱶
	

	
	
	//�렂�뀡 �뙆�씪 �뾽濡쒕뱶
	
	@PostMapping("pensionUpload.do")
	public String pensionUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirect, HttpServletRequest req ) {
		String filename = "";
		String uuid= UUID.randomUUID().toString();
		
		if(!file.isEmpty()) {
			filename = uuid+"_"+file.getOriginalFilename();

//			String path = req.getSession().getServletContext().getRealPath("/").concat("resources");
			String path = "C:\\tmp\\";
			String imgUploadPath = path+File.separator;
			
			try {
				new File(imgUploadPath).mkdirs(); 
				file.transferTo(new File(imgUploadPath+filename));
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}

		return "redirect: partner/register";
	}
	
	
	
	/**
	@PostMapping("pensionUpload.do")
	public String pensionUpload(@RequestParam("multiFile") List<MultipartFile> multiFileList) {
		String filename = "";
		
		if(!multiFileList.isEmpty()) {
			for(int i=0;i<multiFileList.size();i++) {
				
			filename = multiFileList.get(i).getOriginalFilename();
			System.out.println(multiFileList.get(i).getOriginalFilename());
			
//			String path = "C:\\Users\\woori\\Documents\\workspace-sts-3.9.18.RELEASE\\.metadata\\.plugins\\org.eclipse.wst.server.core"
//					+ "\\tmp2\\wtpwebapps\\spring\\resources\\images\\";
			
			String path = "C:\\tmp\\";
			
			try {
				new File(path).mkdirs(); 
				multiFileList.get(i).transferTo(new File(path+filename));
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			}
		
		}
	
		return "partner/register";
	
	}
*/
	
	
}
