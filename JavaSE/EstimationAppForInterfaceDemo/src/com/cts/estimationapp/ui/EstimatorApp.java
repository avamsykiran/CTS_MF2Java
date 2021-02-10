package com.cts.estimationapp.ui;

import com.cts.estimationapp.model.CircularHoarding;
import com.cts.estimationapp.model.RectangularHoarding;
import com.cts.estimationapp.service.EstimationService;

public class EstimatorApp {

	public static void main(String[] args) {

		EstimationService es = new EstimationService(12.3, 4.5);
		
		RectangularHoarding rh = new RectangularHoarding(10, 30);
		CircularHoarding ch = new CircularHoarding(12);
		
		System.out.println(es.estiamtePaintCost(rh));
		System.out.println(es.estiamtePaintCost(ch));
	}

}
