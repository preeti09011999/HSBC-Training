package com.hsbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello") // logical name of servlet, whenever anyone wants 
//to access this servlet, then just have to know the logical name
public class HelloServlet extends HttpServlet {
//	without tomcat we can't execute servlet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello from servlet");
		PrintWriter out = resp.getWriter();
		out.println("Hello");
		out.close();
	}
}
