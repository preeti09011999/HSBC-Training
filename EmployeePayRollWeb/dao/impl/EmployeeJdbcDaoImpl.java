package com.hsbc.employeepayroll.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.entity.Manager;

public class EmployeeJdbcDaoImpl implements EmployeeDao{

	// Adding sql queries
	private static final String SELECT_EMPLOYEES_SQL = "SELECT * FROM employee";
	
	// database connections
	private final String USER_NAME = "root";
	private final String PASSWORD = "root";
	private final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/employees";
	
	private Connection con;
	
	public EmployeeJdbcDaoImpl() {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void addEmployee(Employee newEmployee) {
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		System.out.println("finding employees");
		List<Employee> employees = new ArrayList<Employee>();
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		try {
			stmt = con.prepareStatement(SELECT_EMPLOYEES_SQL);
			resultSet = stmt.executeQuery();
			while(resultSet.next()) {
				Employee e = new Manager();
				// fetching value for id column from db and putting it in employee object
				e.setId(resultSet.getInt(1));
				// fetching value for name column from db and putting it in employee object
				e.setName(resultSet.getString(2));
				// fetching value for salary column from db and putting it in employee object
				e.setSalary(resultSet.getInt(3));
				employees.add(e);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		// in production it is must to close the resources
		finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return employees;
	}
	
	
}
