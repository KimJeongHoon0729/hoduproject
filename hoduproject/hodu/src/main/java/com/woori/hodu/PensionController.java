package com.woori.hodu;

import java.io.File;
import java.lang.System.Logger;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.woori.domain.PensionVO;
import com.woori.domain.ReviewVO;
import com.woori.domain.RoomVO;
import com.woori.service.PensionService;

@Controller
public class PensionController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PensionController.class);
	
	@Inject
	private PensionService pensionService;
	
	@RequestMapping("likeList.do")
	public String likeList(PensionVO vo, Model model) {
		
		List<PensionVO> likeList = pensionService.likeList(vo);
		List<String> rating = new ArrayList<String>(Arrays.asList());
		List<String> price = new ArrayList<String>(Arrays.asList());
		for(int i =0; i<likeList.size();i++) {
			if(pensionService.rating(likeList.get(i).getPensionName()) != null) {
			rating.add(i, pensionService.rating(likeList.get(i).getPensionName()));
			} else {
				rating.add(i, "첫 후기를 작성해주세요.");
			}
			if(pensionService.price(likeList.get(i).getPensionName()) != null) {
				price.add(i, pensionService.price(likeList.get(i).getPensionName()));
			} else {
				price.add(i, "정보가 없습니다.");
			}
				
		}

		model.addAttribute("rating", rating);
		model.addAttribute("price",price);
		model.addAttribute("likeList",likeList);
		
		
		return "user/list";
	}

	@RequestMapping("moneyList.do")
	public String moneyList(PensionVO vo, Model model) {
		
		List<PensionVO> moneyList = pensionService.moneyList(vo);
		List<String> rating = new ArrayList<String>(Arrays.asList());
		List<String> price = new ArrayList<String>(Arrays.asList());
		for(int i =0; i<moneyList.size();i++) {
			if(pensionService.rating(moneyList.get(i).getPensionName()) != null) {
			rating.add(i, pensionService.rating(moneyList.get(i).getPensionName()));
			} else {
				rating.add(i, "첫 후기를 작성해주세요.");
			}
			if(pensionService.price(moneyList.get(i).getPensionName()) != null) {
				price.add(i, pensionService.price(moneyList.get(i).getPensionName()));
			} else {
				price.add(i, "정보가 없습니다.");
			}

				
		}

		model.addAttribute("rating", rating);
		model.addAttribute("price",price);
		model.addAttribute("moneyList",moneyList);
		
		return "user/list";
	}
	
	@RequestMapping("roomInfo.do")
	public String roomInfo(RoomVO vo, @RequestParam("idx") int idx, @RequestParam("pensionName") String pensionName,HttpSession session, RedirectAttributes redirect){
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
	
	@RequestMapping("RoomList.do")
	public String RoomList(RoomVO vo, Model model) {
		
		List<RoomVO> RoomList = pensionService.RoomList(vo);
		model.addAttribute("RoomList",RoomList);
		
		return "user/list_pension";
	}
	
	@RequestMapping("pensionRegister.do")
	public String pensionRegister(PensionVO vo, @RequestParam("pensionName") String pensionName,HttpSession session, RedirectAttributes redirect) {
		pensionService.pensionRegister(vo);
	
		if(session.getAttribute("pensionName") == null) {
			redirect.addAttribute("pensionName", vo.getPensionName());
			session.setAttribute("pensionName", vo.getPensionName());
			
		}
		return "partner/roomRegister";
	}
	
	@PostMapping("ImgRegister.do")
	public String fileUpload(@RequestParam("file") MultipartFile pension_img, HttpServletRequest req ) {
		String filename = "";
		String uuid= UUID.randomUUID().toString();
		
		if(!pension_img.isEmpty()) {
			filename = uuid+"_"+pension_img.getOriginalFilename();
			System.out.println(pension_img.getOriginalFilename());
			
			String path = req.getSession().getServletContext().getRealPath("/").concat("resources");
			String imgUploadPath = path+File.separator+"imgUpload"+File.separator;
			
			try {
				new File(imgUploadPath).mkdirs(); 
				pension_img.transferTo(new File(imgUploadPath+filename));
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	
		return "partner/roomRegister";
	}
}

