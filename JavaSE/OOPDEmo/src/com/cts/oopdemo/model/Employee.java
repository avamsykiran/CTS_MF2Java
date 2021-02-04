package com.cts.oopdemo.model;

public class Employee {

	private int empId;
	private String fullName;
	private double basic;
			
	public Employee() {
		//default constructor as it has no args
	}
	
	/* this is a parametrized constructor as it has args.
	 * */
	public Employee(int empId, String fullName, double basic) { 
		this.empId = empId;
		this.fullName = fullName;
		this.basic = basic;
	}
	
	//copy constructor
	public Employee(Employee other) {
		this.empId=other.empId;
		this.fullName=other.fullName;
		this.basic=other.basic;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
}
