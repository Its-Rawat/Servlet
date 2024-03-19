package com.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet{
	// Life Cycle Methods
	
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating object");
	}
	
	public void service(ServletRequest rq, ServletResponse rs)throws ServletException, IOException {
		System.out.println("Serviceing.....");
		
		
	}
	
	public void destroy() {
		System.out.println("Going to Destroy Servlet Object");
	}

	// Non Life Cycle Methods
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "This Servlet is Created by Aditya";
	}
}
