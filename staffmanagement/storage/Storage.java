package com.hsbc.staffmanagement.storage;

import com.hsbc.staffmanagement.entity.Employee;
import com.hsbc.staffmanagement.exception.EmployeeAlreadyExistsException;
import com.hsbc.staffmanagement.exception.EmployeeNotFoundException;

public interface Storage {
	void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
	Employee getEmployee(int empNo) throws EmployeeNotFoundException;
}
