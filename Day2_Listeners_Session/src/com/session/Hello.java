package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		HttpSession httpSession=request.getSession();
		PrintWriter out=response.getWriter();
		
		String newURL = response.encodeURL("Hello2");
		
		httpSession.setAttribute("name", "raj");
		out.println("Click <a href=\"" + newURL + "\">here</a> for another servlet");
	}


}








