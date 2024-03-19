package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class MainForm extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome to Form Servlet</h2>");
		String Name = request.getParameter("user_name");
		String Password = request.getParameter("user_password");
		String Email = request.getParameter("user_email");
		String Gender = request.getParameter("user_gender");
		String Course = request.getParameter("user_course");
		String Condition = request.getParameter("condition");
		if(Condition != null) {
		if(Condition.equals("checked")) {
			System.out.println("Conditions Met!!.");
			out.println("<h2>Name: "+Name+" </h2>");
			out.println("<h2>Password: "+Password+" </h2>");
			out.println("<h2>Email: "+Email+" </h2>");
			out.println("<h2>Gender: "+Gender+" </h2>");
			out.println("<h2>Course: "+Course+" </h2>");
		}else {
			out.println("<h2>You have Not Checked Terms and Conditions..</h2>");
		}
		}else {
			out.println("<h2>You have Not Checked Terms and Conditions..</h2>");
		}
	}
}
