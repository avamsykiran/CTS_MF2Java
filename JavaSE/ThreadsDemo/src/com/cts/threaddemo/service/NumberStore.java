package com.cts.threaddemo.service;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {

	private List<Integer> store;
	private int capacity;
	
	public NumberStore(int capacity) {
		this.capacity=capacity;
		this.store= new ArrayList<Integer>();
	}
	
	public List<Integer> getStore(){
		return store;
	}
	
	public synchronized int next() throws InterruptedException {
		String name = Thread.currentThread().getName();
		
		Thread.sleep(500);
		
		while(store.isEmpty()) {
			System.out.println(name+">> waiting...");
			wait();
		}
		int ele = store.get(0);
		store.remove(0);
		System.out.println(name+">> retrived "+ele);
		notifyAll();
		return ele;
	}
	
	public synchronized void add(int n) throws InterruptedException {
		String name = Thread.currentThread().getName();
		
		Thread.sleep(1500);
		
		while(store.size()==capacity) {
			System.out.println(name+">> waiting...");
			wait();
		}
		store.add(n);
		System.out.println(name+">> added "+n);
		notifyAll();
	}
}
