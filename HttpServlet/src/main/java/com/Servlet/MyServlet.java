package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.*;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		
		System.out.println("This is Get Method..");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>This is Get Method of my Servlet..</h1>");
	}
	
}
