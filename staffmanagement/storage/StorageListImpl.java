package com.hsbc.staffmanagement.storage;

import java.util.ArrayList;
import java.util.Collections;

import com.hsbc.staffmanagement.entity.Employee;
import com.hsbc.staffmanagement.exception.EmployeeAlreadyExistsException;
import com.hsbc.staffmanagement.exception.EmployeeNotFoundException;

public class StorageListImpl implements Storage {
	ArrayList<Employee> employees;
	public StorageListImpl() {
		employees = new ArrayList<Employee>();
	}
	
	public void sort() {
		Collections.sort(employees);
	}
	@Override
	public void addEmployee(Employee employee) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		employees.add(employee);
		
	}
	@Override
	public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
		for(Employee emp : employees) {
			if(emp.getEmpNo() == empNo) {
				return emp;
			}
		}
		throw new EmployeeNotFoundException("Employee Not Found");
	}
}
