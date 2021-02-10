package com.cts.estimationapp.service;

import com.cts.estimationapp.model.Hoarding;

public class EstimationService {

	private double paintingRate;
	private double borderingRate;
	
	public EstimationService(double paintingRate, double borderingRate) {
		this.paintingRate = paintingRate;
		this.borderingRate = borderingRate;
	}
	
	public double estiamtePaintCost(Hoarding h) {
		return h.getArea()*paintingRate;
	}
	
	public double estiamteBorderCost(Hoarding h) {
		return h.getPerimeter()*borderingRate;
	}	
	
}
