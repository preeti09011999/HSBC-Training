package com.hsbc.employeepayroll.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.factory.EmployeeDaoFactory;
import com.hsbc.employeepayroll.factory.EmployeeViewFactory;
import com.hsbc.employeepayroll.view.View;
@WebServlet("/employee")
public class EmployeeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. Accept user's request and fetch request data
			// - validate it (VALIDATION is must on both the frontend and backend sides as client can
			// disable js on browser
		// 2. Based on the request indentify appropriate class which can handle this request
		// 3. Calling appropriate buisness method
		// 4. receive result from buisness method
		// 5. Identify appropriate view and send data to that view
		
		//System.out.println("In controller");
		// Fetch object of respective DaoImpl from Factory
		EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
		
		// fetch all employees from DaoImpl
		List<Employee> allEmployees = employeeDao.findAllEmployees();
		
		//print all employees on console using appropriate view class
		
		//1 Identify view and get the object
		View view = EmployeeViewFactory.getEmployeeView();
		
		// call to display all method
		// pass appropriate data to the view
		view.displayAllEmployees(allEmployees);
	}
}
