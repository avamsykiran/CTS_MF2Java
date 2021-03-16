package com.cts.threaddemo.service;

import java.util.Random;

public class Producer implements Runnable{

	private NumberStore store;
	private String jobName;
	private int lowerLimit;
	private int upperLimit;
	
	public Producer(int lowerLimit,int upperLimit,NumberStore store,String jobName) {
		this.jobName=jobName;
		this.lowerLimit=lowerLimit;
		this.upperLimit=upperLimit;
		this.store=store;
	}
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		//Random  r = new Random();
		for(int i=lowerLimit;i<=upperLimit;i++) {
			try {
				System.out.println(t.getName() + " is doing " + jobName);
				store.add(i);
			} catch (InterruptedException e) {
				t.interrupt();
				System.out.println(e.getMessage());
			}
		}
	}
}
