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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.woori.domain.CCriteria;
import com.woori.domain.CMyCriteria;
import com.woori.domain.CPageMakerVO;
import com.woori.domain.CommunityVO;
import com.woori.domain.Criteria;
import com.woori.domain.PPageMakerVO;
import com.woori.domain.PageMakerVO;
import com.woori.domain.PensionVO;
import com.woori.domain.ReplyVO;
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
	
	@RequestMapping("roomRegister.do")
	public String roomRegister(RoomVO vo, @RequestParam("pensionName") String pensionName,HttpSession session, RedirectAttributes redirect) {
		pensionService.roomRegister(vo);
	
		if(session.getAttribute("pensionName") == null) {
			redirect.addAttribute("pensionName", vo.getPensionName());
			session.setAttribute("pensionName", vo.getPensionName());
			
		}
		return "partner/roomRegister";
	}
	@RequestMapping("pensionRegister.do")
	public String pensionRegister(PensionVO vo, @RequestParam("file") MultipartFile pension_img, HttpServletRequest req ) {
		 
		 String filename = "";
			String uuid= UUID.randomUUID().toString();
			
			if(!pension_img.isEmpty()) {
				filename = uuid+"_"+pension_img.getOriginalFilename();
				System.out.println(pension_img.getOriginalFilename());
				
				String path = "C:\\Users\\user\\git\\hoduproject\\hoduproject\\hodu\\src\\main\\webapp\\resources";
				String imgUploadPath = path+File.separator+"imgUpload"+File.separator;
				
				try {
					new File(imgUploadPath).mkdirs(); 
					pension_img.transferTo(new File(imgUploadPath+filename));
				} catch(Exception e) {
					e.printStackTrace();
				}
				vo.setImg_pension(filename);
				pensionService.pensionRegister(vo);
			}
			
		return "partner/roomRegister";
	}
	

	
	//커뮤니티 리스트 출력
	@RequestMapping("CList.do")
	public String CList(CCriteria cri, Model model){
		
		List<CommunityVO> CList = pensionService.CList(cri);
		List<String> reply = new ArrayList<String>(Arrays.asList());
		for(int i =0; i<CList.size();i++) {
			reply.add(i, pensionService.ReplyTotal(CList.get(i).getIndex()));
		}
		model.addAttribute("CList",CList);
		model.addAttribute("Reply", reply);
		
		int total = pensionService.AgetCTotal(cri);
		
		CPageMakerVO cPageMaker = new CPageMakerVO(cri, total);

		model.addAttribute("cPageMaker", cPageMaker);
		
		return "community";
	}
	// 내가 쓴 글 리스트
	@RequestMapping("CMyList.do")
	public String CMyList(CMyCriteria cri, Model model) {
		List<CommunityVO> CMyList = pensionService.CMyList(cri);
		List<String> reply = new ArrayList<String>(Arrays.asList());
		for(int i =0; i<CMyList.size();i++) {
			reply.add(i, pensionService.ReplyTotal(CMyList.get(i).getIndex()));
		}
		int total = pensionService.MygetCTotal(cri);
		
		CPageMakerVO cPageMaker = new CPageMakerVO(cri, total);
		model.addAttribute("Reply", reply);
		model.addAttribute("CMyList", CMyList);
		model.addAttribute("cPageMaker", cPageMaker);
		return "community_mypost";
	}
	
	@RequestMapping("CView.do")
	public String CView(int index, Model model, ReplyVO vo, RedirectAttributes redirect) {
		List<ReplyVO> ReplyList = pensionService.ReplyList(vo);
		model.addAttribute("ReplyList",ReplyList);
		redirect.addAttribute("index", index);
		model.addAttribute("CView", pensionService.CView(index));

		return "community_content";
	}
	//커뮤니티 입력
	@RequestMapping("CInsert.do")
	public String CInsert(CommunityVO vo, Model model) {
		pensionService.CInsert(vo);
		return "redirect: CList.do";
	}
	//커뮤니티 수정
	@RequestMapping("CUpdate.do")
	public String CUpdate (int index, CommunityVO vo, Model model, RedirectAttributes redirect) {
		pensionService.CUpdate(vo);
		
		redirect.addAttribute("index", vo.getIndex());
		return "redirect: CView.do";
	}
	@RequestMapping("CView2.do")
	public String CView2(int index, Model model, ReplyVO vo, RedirectAttributes redirect) {
		List<ReplyVO> ReplyList = pensionService.ReplyList(vo);
		model.addAttribute("ReplyList",ReplyList);
		redirect.addAttribute("index", index);
		model.addAttribute("CView2", pensionService.CView(index));

		return "community_update";
	}
	
	//커뮤니티 삭제
	@RequestMapping("CDelete.do")
	public String CDelete(@RequestParam("index") int index, RedirectAttributes redirect) {
		pensionService.CDelete(index);
		redirect.addFlashAttribute("result", "delete success");
		return "redirect: CList.do?pageNum=1&amount=10";
	}
	
	//댓글 입력 및 출력
	@RequestMapping("ReplyInsert.do")
	public String ReplyInsert(ReplyVO vo, RedirectAttributes redirect, @RequestParam("index") int index) {
		pensionService.ReplyInsert(vo);
		redirect.addAttribute("index", index);
		return "redirect: CView.do";
	}
	//댓글 수정
	@RequestMapping("ReplyUpdate.do")
	public String ReplyUpdate (ReplyVO vo, RedirectAttributes redirect) {
		pensionService.ReplyUpdate(vo);
		redirect.addAttribute("index", vo.getIndex());
		return "redirect: CView.do";
	}
	//댓글 삭제
	@RequestMapping("ReplyDelete.do")
	public String ReplyDelete (int reply_index,RedirectAttributes redirect,@RequestParam("index") int index) {
		pensionService.ReplyDelete(reply_index);
		redirect.addAttribute("index", index);
		return "redirect: CView.do";
	}
	
	//펜션 이름 출력
	@RequestMapping("pensionName.do")
	public String NameSelect(PensionVO vo, Model model,@RequestParam("amount") int amount, @RequestParam("pageNum") int pageNum, RedirectAttributes redirect){
		List<PensionVO> NameSelect = pensionService.NameSelect(vo);
		model.addAttribute("NameSelect", NameSelect);
		redirect.addAttribute("amount", amount);
		redirect.addAttribute("pageNum", pageNum);
		return "user/qna_form";
	}
	//객실 이름 출력
	@RequestMapping("roomName.do")
	public String RoomSelect(RoomVO vo, Model model,@RequestParam("pensionName") String pensionName){
		List<RoomVO> RoomSelect = pensionService.RoomSelect(pensionName);
		model.addAttribute("RoomSelect", RoomSelect);
		return "user/reservation";
	}
}

