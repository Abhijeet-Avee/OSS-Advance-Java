package com.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.exceptions.EmployeeNotFoundException;
import com.model.persistence.employee.Employee;
import com.model.service.employee.EmployeeService;
import com.model.service.employee.EmployeeServiceImpl;

@WebServlet("/EmployeeController.do")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService = new EmployeeServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Disable cache in the browser to prevent going back in history after
		//logging out or session out. This is particular for this page only.
		response.setHeader("Cache-Control","private,no-store,no-cache");
		response.setHeader("Pragma","no-cache");
		response.setDateHeader("Expires", -1);
		
		
		String action = request.getParameter("action");
		RequestDispatcher rd;
		
		if(action.equalsIgnoreCase("showall")) {
			List<Employee> employees = employeeService.getAll();
			request.setAttribute("employees",employees);
			rd = request.getRequestDispatcher("allemps.jsp");
			rd.forward(request, response);
		}else if(action.equalsIgnoreCase("addemp")) {
			rd = request.getRequestDispatcher("addEmployee.jsp");
			rd.forward(request, response);
		}else if(action.equalsIgnoreCase("delete")) {
			Integer id = Integer.parseInt(request.getParameter("id").trim());
			employeeService.deleteEmployee(id);
			response.sendRedirect("EmployeeController.do?action=showall");
		}else if(action.equalsIgnoreCase("update")) {
			Integer id = Integer.parseInt(request.getParameter("id").trim());
			Employee employee = employeeService
								.getById(id)
								.orElseThrow(
										()->new EmployeeNotFoundException("emp with id "+id+"is not found")
										);
			request.setAttribute("employee", employee);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Integer id = Integer.parseInt(request.getParameter("id").trim());
			String ename=request.getParameter("ename");
			String city=request.getParameter("city");
			String desi=request.getParameter("desi");
			Double salary=Double.parseDouble(request.getParameter("salary"));
			
			Employee employee=new Employee(ename, city, desi, salary);	
			
			if(id==0) {
				employeeService.addEmployee(employee);
			}else {
				employeeService.updateEmployee(id, employee);
			}
			
			response.sendRedirect("EmployeeController.do?action=showall");
	}

}
