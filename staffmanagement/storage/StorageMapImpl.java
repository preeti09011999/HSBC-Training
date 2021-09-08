package com.hsbc.staffmanagement.storage;

import java.util.HashMap;

import com.hsbc.staffmanagement.entity.Employee;
import com.hsbc.staffmanagement.exception.EmployeeAlreadyExistsException;
import com.hsbc.staffmanagement.exception.EmployeeNotFoundException;

public class StorageMapImpl implements Storage {
	HashMap<Integer, Employee> map;
	public StorageMapImpl() {
		map = new HashMap<>();
	}
	
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		if(!map.containsKey(e.getEmpNo()))
			map.put(e.getEmpNo(), e);
		else {
			throw new EmployeeAlreadyExistsException("Employee Doesn't Exist");
		}
	}
	@Override
	public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
		if(map.containsKey(empNo))
			return map.get(empNo);
		else throw new EmployeeNotFoundException("Employee Not Found");
	}
	
}
