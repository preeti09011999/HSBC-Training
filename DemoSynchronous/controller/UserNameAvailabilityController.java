package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.dao.impl.UserDaoImpl;
import com.hsbc.exception.UserAlreadyExistsException;

import om.hsbc.dao.UserDao;

@WebServlet("/check")
public class UserNameAvailabilityController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Use Factory to do loose coupling
		UserDao userDao = new UserDaoImpl();
		String username = req.getParameter("username");
		PrintWriter out = resp.getWriter();
//		if(username.equals("hsbc")) {
		try {
			if(userDao.checkIfUserNameExists(username)) {
				out.println("Available");
			}
		}
		
		catch(UserAlreadyExistsException e) {
			e.printStackTrace();
			out.println(e.toString());
		}
		
	}
}
