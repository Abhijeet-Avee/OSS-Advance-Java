package com.listeners;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Dog dog = null;

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init method of s2 is called...");

		dog = (Dog) this.getServletContext().getAttribute("dog");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("hello to servlet S2");
		
		dog.setDogName("foof");
		synchronized (this) {
			this.getServletContext().setAttribute("dog", dog);
		}
		
		
		
	}

}