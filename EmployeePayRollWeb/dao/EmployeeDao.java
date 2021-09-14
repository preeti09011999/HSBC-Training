package com.hsbc.employeepayroll.dao;

import java.util.List;

import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	
	void addEmployee(Employee newEmployee);
	List<Employee> findAllEmployees();
}
