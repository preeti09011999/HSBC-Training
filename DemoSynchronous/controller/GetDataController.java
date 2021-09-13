package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class GetDataController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In doGet()");
		// req.getParameter("this_is_exactly_same_as_request_parameter_name_we're_trying_to_fetch");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(username.equals("hsbc") && username.equals("hsbc")) {			
			System.out.println("user has entered " + username + " and password " + password);
		}
		else {
			System.out.println("Wrong credentials");
		}
	}
}
