package com.cts.threaddemo.service;

import java.util.Random;

public class Producer extends Thread{

	private NumberStore store;
	private int limit;
	
	public Producer(int limit,NumberStore store,String name) {
		super(name);
		this.limit=limit;
		this.store=store;
	}
	
	@Override
	public void run() {
		Random  r = new Random();
		for(int i=1;i<=limit;i++) {
			try {
				store.add(r.nextInt(100));
			} catch (InterruptedException e) {
				interrupt();
				System.out.println(e.getMessage());
			}
		}
	}
}
