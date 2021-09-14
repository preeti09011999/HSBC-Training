package com.hsbc.employeepayroll.factory;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.dao.impl.EmployeeInMemoryCollectionDaoImpl;
import com.hsbc.employeepayroll.dao.impl.EmployeeJdbcDaoImpl;
public class EmployeeDaoFactory {
	public static EmployeeDao getEmployeeDao() {
//		EmployeeInMemoryDaoImpl dao = new EmployeeInMemoryDaoImpl();
		EmployeeDao employeeDao = new EmployeeJdbcDaoImpl();
		return employeeDao;
	}
}
