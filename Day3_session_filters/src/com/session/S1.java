package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		
//		Cookie cookie=new Cookie("app.user", "ramesh");
//		cookie.setMaxAge(20*60);//min
//		response.addCookie(cookie);

	//	response.sendRedirect("S2");
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("name", "rajeev");
//
//		String newURL = response.encodeURL("S2");
//
//		out.println("Click <a href=\"" + newURL + "\">here</a> for another servlet");

		response.sendRedirect("S2");
	}

}