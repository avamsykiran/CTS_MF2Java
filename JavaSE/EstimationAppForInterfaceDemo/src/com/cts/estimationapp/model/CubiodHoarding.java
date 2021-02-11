package com.cts.estimationapp.model;

public class CubiodHoarding extends RectangularHoarding{
	
	private int height;
	
	public CubiodHoarding() {
		// TODO Auto-generated constructor stub
	}

	public CubiodHoarding(int length, int breadth,int height) {
		super(length, breadth);
		this.height=height;				
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getVolume() {	
		return getLength()*getBreadth()*height;
	}
}
