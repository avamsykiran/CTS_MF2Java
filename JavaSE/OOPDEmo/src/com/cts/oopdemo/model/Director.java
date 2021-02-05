package com.cts.oopdemo.model;

public class Director extends Manager {

	private double share;

	public Director() {
		System.out.println("Director Created!");
	}
	
	public Director(int empId, String fullName, double basic, double allowence,double share) {
		super(empId, fullName, basic, allowence);
		this.share=share;
	}

	public double getShare() {
		return share;
	}

	public void setShare(double share) {
		this.share = share;
	}
	
	
}
