package com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class F4 implements Filter {

	long timePeriod=0;
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//?
		long start= System.currentTimeMillis();
		
		chain.doFilter(request, response);
		//?
		
		long end= System.currentTimeMillis();
		
		System.out.println("time taken: "+ (end-start));
		
	}

	

}