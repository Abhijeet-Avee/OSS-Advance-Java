package com.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class DogServletContextAttributeListener implements ServletContextAttributeListener {

  
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
        System.out.println("attributeAdded is called ...");
    }

    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	 System.out.println("attributeRemoved is called ...");
    }

	
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	 System.out.println("attributeReplaced is called ...");
    }	
}