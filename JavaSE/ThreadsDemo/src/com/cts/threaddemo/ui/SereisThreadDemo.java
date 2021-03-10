package com.cts.threaddemo.ui;

import com.cts.threaddemo.service.SeriesService;

public class SereisThreadDemo {

	public static void main(String[] args) {
		
		SeriesService ss1 = new SeriesService(10,20);
		SeriesService ss2 = new SeriesService(100,150);
		
		Thread t1 = new Thread(ss1, "sereis1");
		Thread t2 = new Thread(ss2, "sereis2");
		
		//ss1.executeSeries();
		//ss2.executeSeries();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			//t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		System.out.println("The program terminated!");
	}

}
