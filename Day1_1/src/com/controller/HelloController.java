package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.Calculator;

public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		Integer firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
		Integer secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
		
		Integer sum = Calculator.sum(firstNumber, secondNumber);
		request.setAttribute("result", sum);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}
}
