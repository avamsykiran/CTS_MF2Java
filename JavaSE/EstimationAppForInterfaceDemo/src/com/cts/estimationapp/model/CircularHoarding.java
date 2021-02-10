package com.cts.estimationapp.model;

public class CircularHoarding implements Hoarding{

	private int radius;
	
	public CircularHoarding() {
		// TODO Auto-generated constructor stub
	}
		
	public CircularHoarding(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2*PI*radius;
	}

	@Override
	public double getArea() {
		return PI*radius*radius;
	}

}
