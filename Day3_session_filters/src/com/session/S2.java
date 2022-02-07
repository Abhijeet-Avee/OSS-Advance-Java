package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
//		HttpSession httpSession=request.getSession(false);
//		//if pre existing sesseion is thre use it or else give null
//		if(httpSession!=null) {
//			httpSession.invalidate();
//		}
//		
		HttpSession httpSession=request.getSession();
		String name= (String) httpSession.getAttribute("name");
		out.print(name);
//		Cookie[] cookies= request.getCookies();
//		if(cookies!=null) {
//			for(Cookie cookie: cookies) {
//				if(cookie.getName().equals("app.user")) {
//					out.print(cookie.getValue());
//				}
//			}
			
		}
		
	

	

}