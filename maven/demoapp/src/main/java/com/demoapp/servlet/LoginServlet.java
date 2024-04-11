package com.demoapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. get requestd parametes
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		//if the password is 1234 then print welcome<usemname> else print invalid user
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>login</title></head><body>");
		if(pwd.equals("1234")) {
			out.println("<h2>Welcome " + uname + "</h2>");
		}else {
			out.println("<h3> invalid user </h3>");
		}
		
		out.println("</body></html>");
		out.close();
		
	}

}
