package com.demo;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet implements SingleThreadModel {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		Dog dog=new Dog();
		dog.setDogName("stonish");
		
		Person person=new Person();
		person.setName("foo");
		person.setDog(dog);
		
		String[] footballTeams = { "Liverpool", "Manchester Utd", "Arsenal", "Chelsea" };

		request.setAttribute("footballList", footballTeams); 
		
		List<String> names= Arrays.asList("raj","ekta","gun","keshav");
		request.setAttribute("names", names);
		
		request.setAttribute("person", person);
		
		
							//request.getRequestDispatcher("sucess.jsp");
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/success.jsp");
		rd.forward(request, response);
		
	}

}