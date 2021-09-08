package com.hsbc.staffmanagement.storage;

import java.util.TreeSet;

import com.hsbc.staffmanagement.entity.Employee;
import com.hsbc.staffmanagement.exception.EmployeeAlreadyExistsException;
import com.hsbc.staffmanagement.exception.EmployeeNotFoundException;

public class StorageSortedImpl implements Storage {
	TreeSet<Employee> set = new TreeSet<>();
	public void sort(Employee[] employees) {
		for(Employee employee : employees) {
			set.add(employee);
		}
		System.out.println(set);
	}
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		set.add(e);
	}
	@Override
	public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
		for(Employee emp : set) {
			if(emp.getEmpNo() == empNo) return emp;
		}
		throw new EmployeeNotFoundException("Employee Not Found");
	}
	
	
}
