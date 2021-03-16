package com.cts.threaddemo.service;

import java.util.Random;

public class Consumer implements Runnable {
	
	private NumberStore store;
	private int limit;
	private String jobName;
	
	public Consumer(int limit,NumberStore store,String jobName) {		
		this.limit=limit;
		this.store=store;
		this.jobName=jobName;
	}
	
	@Override
	public void run() {		
		Thread t = Thread.currentThread();
		for(int i=1;i<=limit;i++) {
			try {
				System.out.println(t.getName() + " is doing " + jobName);
				int ele=store.next();
				System.out.println("Is "+ele+"Prime? " + isPrime(ele));
			} catch (InterruptedException e) {
				t.interrupt();
				System.out.println(e.getMessage());
			}
		}
	}

	private boolean isPrime(int ele) {
		boolean prime=true;
		
		for(int i=2;i<ele/2;i++) {
			if(ele%i==0) {
				prime=false;
				break;
			}
		}
		
		return prime;
	}
}