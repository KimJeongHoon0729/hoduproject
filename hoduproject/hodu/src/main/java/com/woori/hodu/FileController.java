package com.woori.hodu;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	@GetMapping("/uploadform")
	public String upload() {
		return "uploadform";
	}
	
	@PostMapping("/upload")
	public String fileUpload(@RequestParam("file") MultipartFile businessNum_img) {
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
		return "uploadok";
	}
	
	
}
