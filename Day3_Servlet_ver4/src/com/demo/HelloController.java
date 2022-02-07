package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="myservlet",  loadOnStartup=1, urlPatterns= {"/myservlet.do"})
//@WebServlet({"/HelloController", "/WelcomeController"})
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public HelloController() {
		System.out.println("myservlet default ctr is called ...");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("myservlet is requested ...");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}