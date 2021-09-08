package com.hsbc.staffmanagement.entity;

import java.util.Date;
import java.util.Objects;


public class Employee implements Comparable<Employee>{
	
	private int empNo;
	private String firstName;
	private String lastName;
	private String city;
	private int salary;
	private Date dateOfJoining; 
	
	public Employee(String firstName, String lastName, String city, int salary, Date dateOfJoining) {
		
		System.out.println("In parametrized constructor of Employee");
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(this.getFirstName(), other.getFirstName());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getFirstName());
	}
	
//	Comparable compareTo gives natural sorting algorithm for the class in which
//	it is implementing
//	What if we need additional sorting algorithm apart from natural sorting?
//	We can't do that using Comparable
	
//	to achieve additional sorting algorithm or to implement, java gives one more
//	interface => Comparator
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getSalary() - o.getSalary();
	}	
	
}
