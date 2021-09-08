package com.hsbc.staffmanagement.storage;

import com.hsbc.staffmanagement.exception.EmployeeAlreadyExistsException;
import com.hsbc.staffmanagement.exception.EmployeeNotFoundException;
import com.hsbc.staffmanagement.entity.Employee;

public class StorageImpl implements Storage{

	private Employee employees[];
	private static int idx;
	
	public StorageImpl(){
		employees = new Employee[2];
		idx = 0;
	}
	
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException{
		// TODO Auto-generated method stub
		boolean flag = false;
		for(Employee checkEmployee : employees) {
			if(checkEmployee != null &&  checkEmployee.getEmpNo() == e.getEmpNo()) {
				flag = true;
				throw new EmployeeAlreadyExistsException("Employee Doesn't exist");
			}
		}
		if(!flag) {
			if(idx == employees.length) return;
			employees[idx++] = e;
			System.out.println("Employee added");
		}
		else return;
	}

	@Override
	public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
		for(Employee findEmployee : employees) {
			if(findEmployee != null && findEmployee.getEmpNo() == empNo) {
				System.out.println("employee found");
				return findEmployee;
			}
		}
		throw new EmployeeNotFoundException("Employee Not Found");
	}
	
}
