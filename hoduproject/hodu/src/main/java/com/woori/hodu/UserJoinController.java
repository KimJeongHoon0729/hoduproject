package com.woori.hodu;

import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.woori.domain.Criteria;
import com.woori.domain.PageMakerVO;
import com.woori.domain.PartnerVO;
import com.woori.domain.PensionVO;
import com.woori.domain.QuestionVO;
import com.woori.domain.UserVO;
import com.woori.service.UserJoinServiceImpl;

@Controller
public class UserJoinController {

		private static final Logger logger = LoggerFactory.getLogger(UserJoinController.class);
		
		@Inject
		UserJoinServiceImpl userJoinService;
		
		@Inject
		BCryptPasswordEncoder pwdEncoder;
		
		//로그인
		@RequestMapping("login.do")
		public String login() {
			return "login";
		}
		
		@RequestMapping("logincheck.do")
		public ModelAndView logincheck(@ModelAttribute UserVO vo, HttpSession session) {
			UserVO result = userJoinService.logincheck(vo, session);
			
			ModelAndView mav = new ModelAndView();
			if(result != null) {
				boolean pwdMatch = pwdEncoder.matches(vo.getUserPw(), result.getUserPw());
				if(pwdMatch == true ) { //로그인 성공
				mav.setViewName("index");
				mav.addObject("msg", "sucess");
			
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
		
		@RequestMapping("logout.do")
		public ModelAndView logout(HttpSession session) {
			userJoinService.logout(session);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			mav.addObject("msg", "logout");
			return mav;
		}
		
		
		@RequestMapping(value="signin.do", method=RequestMethod.GET)  //get으로 접근
		public String userJoin(UserVO vo) {
			
			
			return "/signin";  // user/list
		}
		
		
		
		// 회원가입 post
		@RequestMapping(value="signin.do", method = RequestMethod.POST)
		public String userJoin2(UserVO vo, HttpServletResponse response) throws Exception {
			int result = userJoinService.idCheck(vo);
			if(result == 1) {
				return "/signin";
			} else if(result == 0) {
				String inputPass = vo.getUserPw();
				String pwd = pwdEncoder.encode(inputPass);
				vo.setUserPw(pwd);
				userJoinService.insertUser(vo);
				response.setContentType("text/html; charset=UTF-8");
	            PrintWriter out = response.getWriter();
	            out.println("<script>alert('회원가입이 완료되었습니다.'); location.href='/';</script>");
	            out.flush(); 
			}
			
			return "redirect:/";
		}
		
		@RequestMapping("viewProfile.do")
		public String viewProfile(String userId, Model model) {
			model.addAttribute("user", userJoinService.viewProfile(userId));
			
			return "user/mypage/editProfile";
		}
		
		@RequestMapping("editProfile.do")
		public String editProfile(@ModelAttribute UserVO vo) {
			String inputPass = vo.getUserPw();
			String pwd = pwdEncoder.encode(inputPass);
			vo.setUserPw(pwd);
			userJoinService.editProfile(vo);
			
			return "user/mypage/mypage";
		}
		
		// 아이디 중복 체크
		@ResponseBody
		@RequestMapping(value="/idCheck", method = RequestMethod.POST)
		public int idCheck(UserVO vo) {
			int result = userJoinService.idCheck(vo);
			return result;
		}
		
		@RequestMapping("deleteProfile.do")
		public String deleteProfile(String userId, HttpSession session) {
			userJoinService.deleteProfile(userId, session);
			
			return "redirect:/";
		}
		
		//q리스트 출력
		
		@RequestMapping("QList.do")
		public String QList(Criteria cri, Model qmodel) {
	
			List<QuestionVO> QList = userJoinService.QList(cri);
			qmodel.addAttribute("QList",QList);
			
			int total = userJoinService.getTotal(cri);
			
			PageMakerVO pageMaker = new PageMakerVO(cri, total);
			
			qmodel.addAttribute("pageMaker", pageMaker);
			
			return "user/qna_list";
		}
		
		//Q 비밀번호
		@RequestMapping("Q_pwCheck.do")
		public ModelAndView Q_pwCheck(@ModelAttribute QuestionVO qvo, @RequestParam("pageNum") int pageNum, @RequestParam("amount") int amount, HttpSession qsession, RedirectAttributes redirect) {
			QuestionVO result = userJoinService.Q_pwCheck(qvo, qsession);
			
			ModelAndView mav = new ModelAndView();
			if(result != null) { //로그인 성공
				redirect.addAttribute("Q_idx", qvo.getQ_idx());
				mav.setViewName("redirect: QView.do");
				mav.addObject("msg", "sucess");
				
			} else { //로그인 실패
				redirect.addAttribute("pageNum", pageNum);
				redirect.addAttribute("amount", amount);
				mav.setViewName("redirect: QList.do");
				mav.addObject("msg", "fail");
			}
			return mav;
		}
		
		//Q 글쓰기
		@RequestMapping("Q_insert.do")
		public String Q_insert(@ModelAttribute QuestionVO qvo, @RequestParam("pageNum") int pageNum, @RequestParam("amount") int amount, RedirectAttributes redirect) {
			
			userJoinService.Q_insert(qvo);
			redirect.addAttribute("pageNum", pageNum);
			redirect.addAttribute("amount", amount);
			return "redirect: QList.do";
		}
		
		//Q 확인
		@RequestMapping("QView.do")
		public String QView(int Q_idx,HttpSession qsession, Model qmodel) {
			qmodel.addAttribute("QView", userJoinService.QView(Q_idx,qsession));
			
			return "user/q_content";
		}
		
		
}





