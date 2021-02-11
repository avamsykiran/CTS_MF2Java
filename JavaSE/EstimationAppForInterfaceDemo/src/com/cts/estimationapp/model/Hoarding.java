package com.cts.estimationapp.model;

public interface Hoarding {

	public static final double PI=3.14;
	
	public abstract double getPerimeter();
	public abstract double getArea();
	
	public default double getVolume() {
		return 0;
	}	
	
}
