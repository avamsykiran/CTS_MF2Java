package com.cts.threaddemo.service;

import java.util.Random;

public class Consumer extends Thread{

	private NumberStore store;
	private int limit;
	
	public Consumer(int limit,NumberStore store,String name) {
		super(name);
		this.limit=limit;
		this.store=store;
	}
	
	@Override
	public void run() {		
		for(int i=1;i<=limit;i++) {
			try {
				int ele=store.next();
				System.out.println("Is "+ele+"Prime? " + isPrime(ele));
			} catch (InterruptedException e) {
				interrupt();
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