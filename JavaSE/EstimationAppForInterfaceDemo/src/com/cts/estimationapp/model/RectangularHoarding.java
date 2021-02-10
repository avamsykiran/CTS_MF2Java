package com.cts.estimationapp.model;

public class RectangularHoarding implements Hoarding{

	private int length;
	private int breadth;
	
	public RectangularHoarding() {
		// TODO Auto-generated constructor stub
	}
		
	public RectangularHoarding(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getPerimeter() {
		return 2*(length+breadth);
	}

	@Override
	public double getArea() {
		return length*breadth;
	}

}
