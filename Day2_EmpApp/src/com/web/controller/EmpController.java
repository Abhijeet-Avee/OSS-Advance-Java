package com.web.controller;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.persistence.Employee;
import com.model.service.EmployeeService;
import com.model.service.EmployeeServiceImpl;

public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			String ename=request.getParameter("ename");
			String city=request.getParameter("city");
			String desi=request.getParameter("desi");
			Double salary=Double.parseDouble(request.getParameter("salary"));
			
			Employee employee=new Employee(ename, city, desi, salary);
		
			Employee savedEmployee= employeeService.addEmployee(employee);
			
			HttpSession httpSession=request.getSession();
			
			httpSession.setAttribute("employee", savedEmployee);
			
//			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
//			rd.forward(request, response);
			
			response.sendRedirect("resultPage.jsp");
		}
				
	}

}
