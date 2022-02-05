package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession httpSession=request.getSession();
		
		Integer counter= (Integer) httpSession.getAttribute("counter");
		
		if(counter==null) {
			out.print("you are first time user");
			httpSession.setAttribute("counter", new Integer(1));
		}else {
			out.print("you have alread visited..."+counter);
			counter++;
			httpSession.setAttribute("counter", counter);
		}
		
		
		
//		
//		out.print("session id:"+ httpSession.getId()+"<br>");
//		out.print("session isNew:"+ httpSession.isNew()+"<br>");
//		out.print("session getCreationTime:"+ httpSession.getCreationTime()+"<br>");
//		out.print("session getMaxInactiveInterval:"+ httpSession.getMaxInactiveInterval()+"<br>");
//		out.print("session last access time:"+ httpSession.getLastAccessedTime()+"<br>");
//		
//		
		
		
	}

}