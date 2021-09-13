package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsbc.entity.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/users")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userstr = request.getParameter("user");
		System.out.println(userstr);
		// assume we are fetching this from db
		List<User> users = new ArrayList<User>();
		User u1 = new User();
		u1.setId(1);
		u1.setName("Preeti");
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("Somya");
		users.add(u1);
		users.add(u2);
		// We need to show these users to end user using table tag
		// what do we need to do
		// AJAX request
		// we need json representation of users
		//list<User> users need to be converted to json form
		// "JACKSON" library => Helps in converting Java object to json and vice versa
	
		PrintWriter out = response.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = mapper.writeValueAsString(users);
		out.println(jsonStr);
		out.close();
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
