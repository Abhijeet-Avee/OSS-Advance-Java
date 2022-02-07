package com.demo;
import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Employee> employees=getAllEmployees();
		
		request.setAttribute("employees", employees);
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/success2.jsp");
		rd.forward(request, response);
	}

	private List<Employee> getAllEmployees() {
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(1, "raj", "delhi", "trainer", 54000.00));
		employees.add(new Employee(4, "gun", "delhi", "SE", 59000.00000));
		employees.add(new Employee(19, "keshav", "delhi", "SE", 54000.90000));
		
		return employees;
	}

	
}