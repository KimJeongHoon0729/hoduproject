package com.woori.hodu;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.woori.domain.PCriteria;
import com.woori.domain.PPageMakerVO;
import com.woori.domain.PartnerVO;
import com.woori.domain.QnaVO;
import com.woori.domain.ReservationVO;
import com.woori.service.PartnerJoinServiceImpl;

@Controller
public class PartnerJoinController {

		private static final Logger logger = LoggerFactory.getLogger(PartnerJoinController.class);
		
		@Inject
		PartnerJoinServiceImpl partnerJoinService;
		
		@Inject
		BCryptPasswordEncoder pwdEncoder;
		
		//로그인
		@RequestMapping("plogin.do")
		public String plogin() {
			return "login";
		}
		
		@RequestMapping("plogincheck.do")
		public ModelAndView plogincheck(@ModelAttribute PartnerVO pvo, HttpSession psession, RedirectAttributes redirect) {
			PartnerVO presult = partnerJoinService.plogincheck(pvo, psession);
			ModelAndView mav = new ModelAndView();
			if(presult != null) {
				boolean PpwdMatch = pwdEncoder.matches(pvo.getPartnerPw(), presult.getPartnerPw());
				if(PpwdMatch == true){//로그인 성공
				mav.setViewName("pindex");
				mav.addObject("msg", "sucess");
					if(partnerJoinService.sessionPensionName(pvo.getPartnerId()) != null) {
						mav.addObject("pensionName", partnerJoinService.sessionPensionName(pvo.getPartnerId()));
						psession.setAttribute("pensionName", partnerJoinService.sessionPensionName(pvo.getPartnerId()));
					} else {
					}
					
				} else {
					mav.setViewName("login");
					mav.addObject("msg", "fail");
				}
				} else { //로그인 실패
				mav.setViewName("login");
				mav.addObject("msg", "fail");
			}
			return mav;
		}
		
		@RequestMapping("plogout.do")
		public ModelAndView plogout(HttpSession psession) {
			partnerJoinService.plogout(psession);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("pindex");
			mav.addObject("msg", "logout");
			return mav;
		}
		
		@RequestMapping(value="psignin.do", method=RequestMethod.GET)  //get으로 접근
		public String PartnerJoin(PartnerVO pvo) {
			
			
			return "redirect:/";  // user/list
		}
		
		
		
		// 회원가입 post
		@RequestMapping(value="psignin.do", method = RequestMethod.POST)
		public String partnerJoin2(PartnerVO pvo) {
			int result = partnerJoinService.pidCheck(pvo);
			if(result == 1) {
				return "/signin";
			} else if(result == 0) {
				String inputPw = pvo.getPartnerPw();
				String pwd = pwdEncoder.encode(inputPw);
				pvo.setPartnerPw(pwd);
				partnerJoinService.insertParnter(pvo);
			}
			
			return "redirect:/";
		}
		
		@RequestMapping("viewPProfile.do")
		public String viewPProfile(String partnerId, Model pmodel) {
			pmodel.addAttribute("partner", partnerJoinService.viewPProfile(partnerId));
			
			return "partner/myPpage/editPProfile";
		}
		
		@RequestMapping("editPProfile.do")
		public String editPProfile(@ModelAttribute PartnerVO pvo) {
			String inputPass = pvo.getPartnerPw();
			String pwd = pwdEncoder.encode(inputPass);
			pvo.setPartnerPw(pwd);
			partnerJoinService.editPProfile(pvo);
			
			return "partner/myPpage/myPpage";
		}
		
		// 아이디 중복 체크
		@ResponseBody
		@RequestMapping(value="/pidCheck", method = RequestMethod.POST)
		public int pidCheck(PartnerVO pvo) {
			int result = partnerJoinService.pidCheck(pvo);
			return result;
		}
		
		@RequestMapping("deletePProfile.do")
		public String deletePProfile(String partnerId, HttpSession psession) {
			partnerJoinService.deletePProfile(partnerId, psession);
			
			return "redirect:/";
		}
		
		@RequestMapping("RList.do")
		public String RList(ReservationVO rvo, Model rmodel) {
			
			List<ReservationVO> RList = partnerJoinService.RList(rvo);
			rmodel.addAttribute("RList",RList);
			
			return "partner/myPpage/PreservationList";
		}
		
		@RequestMapping("RView.do")
		public String RView(int reservation_idx, Model rmodel) {
			rmodel.addAttribute("RView", partnerJoinService.RView(reservation_idx));
			
			return "partner/myPpage/PreservationContent";
		}
		
		//예약 삭제
		@RequestMapping("RDelete.do")
		public String RDelete(int reservation_idx, HttpSession rsession, RedirectAttributes redirect) {
			partnerJoinService.RDelete(reservation_idx);
			redirect.addAttribute("partnerId", rsession.getAttribute("partnerId"));
			return "redirect: RList.do";
		}
		
		//예약 수정
		@RequestMapping("RView2.do")
		public String RView2(int reservation_idx, Model rmodel) {
			rmodel.addAttribute("RView", partnerJoinService.RView(reservation_idx));
			
			return "partner/myPpage/PreservationContent_update";
		}
		
		@RequestMapping("RUpdate.do")
		public String RUpdate(@ModelAttribute ReservationVO rvo, @RequestParam("reservation_idx") int reservation_idx, RedirectAttributes redirect) {
			partnerJoinService.RUpdate(rvo);
			redirect.addAttribute("reservation_idx", reservation_idx);
			return "redirect: RView.do";
		}
		
		
		@RequestMapping("AList.do")
		public String QList(PCriteria Pcri, Model qmodel) {
	
			List<QnaVO> AList = partnerJoinService.AList(Pcri);
			qmodel.addAttribute("AList",AList);
			
			int total = partnerJoinService.AgetTotal(Pcri);
			
			PPageMakerVO pageMaker = new PPageMakerVO(Pcri, total);
			
			qmodel.addAttribute("pageMaker", pageMaker);
			
			return "partner/qna";
		}
		
		//Q 확인
		@RequestMapping("AView.do")
		public String AView(int Q_idx,HttpSession qsession, Model qmodel) {
			qmodel.addAttribute("AView", partnerJoinService.AView(Q_idx,qsession));
					
			return "partner/p_q_content";
		}
		
		//A 등록
		@RequestMapping("Acomplete.do")
		public String Aregister(@ModelAttribute QnaVO vo,@RequestParam("Q_idx") int Q_idx, RedirectAttributes redirect) {
			partnerJoinService.ARegister(vo);
			redirect.addAttribute("Q_idx", Q_idx);
			return "redirect: AView.do";
		}
		
}





