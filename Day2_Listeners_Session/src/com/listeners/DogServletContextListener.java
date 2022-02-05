package com.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DogServletContextListener implements ServletContextListener {

	private Dog dog=null;
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("servlet context is called");
		String dogName= sce.getServletContext().getInitParameter("dogName");
		
		dog=new Dog(dogName);
		
		//WE ARE STORING A DOG OBJECT SO THAT ANYBODY SERVLET JSP CAN PICK IT
		
		sce.getServletContext().setAttribute("dog", dog);
		
		System.out.println("servlet context is done");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("servlet context is destroy");
		sce.getServletContext().removeAttribute("dog");
		dog=null;
	}

}