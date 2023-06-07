package com.woori.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AdminInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		response.setContentType("text/html; charset=UTF-8");
		if(session.getAttribute("userId")!= null) {
			if(session.getAttribute("userId").equals("admin")) {

				return true;
			}
		} else if(session.getAttribute("partnerId")!=null) {
			if(session.getAttribute("partnerId").equals("admin")) {

				return true;
			} 
		} 
		return false;
	}

}
