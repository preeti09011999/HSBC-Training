package com.hsbc.employeepayroll.view;

import java.util.List;

import com.hsbc.employeepayroll.entity.Employee;

public interface View {
	public int welcome();
	void displayAllEmployees(List<Employee> employee);
	public Employee acceptEmployee();
	void cleanUp();
}
