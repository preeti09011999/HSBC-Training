package com.hsbc.employeepayroll.util;

import java.util.Comparator;

import com.hsbc.employeepayroll.entity.Employee;
/**
 * 
 * @author preet
 * Comparable => langPackage => contains only compareTo method => gives natural sorting algo
 * Comparator => utilPackage => contains only compare method => gives additional sorting algo
 * Using Comparator we can compare third party classes
 *
 */
public class EmployeeSortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
