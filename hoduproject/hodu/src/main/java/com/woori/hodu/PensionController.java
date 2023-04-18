package com.woori.hodu;

import java.io.File;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.woori.domain.PensionVO;
import com.woori.domain.RoomVO;
import com.woori.service.PensionService;

@Controller
public class PensionController {
	

	@Inject
	private PensionService pensionService;
	
	@RequestMapping("likeList.do")
	public String likeList(PensionVO vo, Model model) {
		
		List<PensionVO> likeList = pensionService.likeList(vo);
		model.addAttribute("likeList",likeList);
		
		return "user/list";
	}

	@RequestMapping("moneyList.do")
	public String moneyList(PensionVO vo, Model model) {
		
		List<PensionVO> moneyList = pensionService.moneyList(vo);
		model.addAttribute("moneyList",moneyList);
		
		return "user/list";
	}
	
	@RequestMapping("partner/roomRegister.do")
	public String roomRegister(RoomVO vo, List<MultipartFile> room_img, HttpServletResponse response) throws Exception {
		String filename = "";
		
		if(!room_img.isEmpty()) {
			for(int i=0;i<room_img.size();i++) {
				
			filename = room_img.get(i).getOriginalFilename();

			
			String path = "C:\\Users\\woori\\Documents\\workspace-sts-3.9.18.RELEASE\\.metadata\\.plugins\\org.eclipse.wst.server.core"
					+ "\\tmp2\\wtpwebapps\\spring\\resources\\images\\";
			
				try {
					new File(path).mkdirs(); 
					room_img.get(i).transferTo(new File(path+filename));
				} catch(Exception e) {
					e.printStackTrace();
				}
				vo.setImg_room(filename);
			
			}
		}
		pensionService.roomRegister(vo);
		
		return "redirect:/p";
	}
	
}
