package com.cts.threaddemo.service;

public class SeriesService implements Runnable{
	
	private int lb;
	private int ub;
	
	public SeriesService(int lb, int ub) {
		this.lb = lb;
		this.ub = ub;
	}

	public void executeSeries() {
		String tName = Thread.currentThread().getName();
		for(int n=lb;n<=ub;n++) {
			System.out.println(tName + ">> "+ n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		executeSeries();		
	}
}
