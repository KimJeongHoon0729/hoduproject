package com.woori.hodu;

import java.io.File;
import java.lang.System.Logger;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping("roomInfo.do")
	public String roomInfo(RoomVO vo, @RequestParam("idx") int idx){
		pensionService.roomRegister(vo);
		if(idx == 0) {

			return "partner/roomRegister";
		} else {
			
			return "/pindex";
		}
		
	}
	
	@RequestMapping("roomImg.do")
	public String roomImg(RoomVO vo, List<MultipartFile> room_img) throws Exception {
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
		return "partner/roomRegister";
	}
}
