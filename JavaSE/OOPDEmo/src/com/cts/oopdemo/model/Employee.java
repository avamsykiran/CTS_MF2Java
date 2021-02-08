package com.cts.oopdemo.model;

public class Employee {

	private int empId;
	private String fullName;
	private double basic;
			
	public Employee() {
		System.out.println("Employee constructed");
	}
	
	/* this is a parametrized constructor as it has args.
	 * */
	public Employee(int empId, String fullName, double basic) { 
		this();
		this.empId = empId;
		this.fullName = fullName;
		this.basic = basic;
	}
	
	//copy constructor
	public Employee(Employee other) {
		this(other.empId,other.fullName,other.basic);
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

	@Override
	public String toString() {
		return "empId=" + empId + ", fullName=" + fullName + ", basic=" + basic + "\n";
	}
	

	
}
