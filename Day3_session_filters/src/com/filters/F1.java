package com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class F1 implements Filter {

	public F1() {
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("i am in watching you..i am filer F1");
		
		HttpServletRequest req= (HttpServletRequest) request;
		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL().toString());
		
		chain.doFilter(request, response);
		
	}

	public void destroy() {
	}

}