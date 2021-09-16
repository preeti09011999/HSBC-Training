package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/lifecycle")
public class LifeCycleController extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println(" In init");	 
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("In service");
	} 
	@Override
	public void destroy() {
		System.out.println("In destroy");
	}
}
