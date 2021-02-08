package com.cts.oopdemo.model;

public class Manager extends Employee {

	private double allowence;

	public Manager() {
		System.out.println("Manager Created!");
	}
	
	public Manager(int empId,String fullName,double basic,double allowence) {
		/*
		 * setEmpId(empId); 
		 * setFullName(fullName); 
		 * setBasic(basic);
		 */
		
		super(empId, fullName, basic);
		this.allowence=allowence;
	}
	
	public double getAllowence() {
		return allowence;
	}

	public void setAllowence(double allowence) {
		this.allowence = allowence;
	}
	

	public String toString() {
		return super.toString() + ",allowence: "+allowence;
	}
}
