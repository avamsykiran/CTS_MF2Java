package com.cts.threaddemo.ui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.cts.threaddemo.service.Consumer;
import com.cts.threaddemo.service.NumberStore;
import com.cts.threaddemo.service.Producer;

public class ThreadPoolDemo {
	public static void main(String[] args) {

		NumberStore store = new NumberStore(7);
		
		Producer p1 = new Producer(1,10, store, "prodJob1");
		Producer p2 = new Producer(11,15, store, "prodJob2");
		Producer p3 = new Producer(16,20, store, "prodJob3");
		
		Consumer c = new Consumer(20, store, "consJob");
		
		ExecutorService threadPoolManager = Executors.newFixedThreadPool(3);
		
		threadPoolManager.execute(c);
		threadPoolManager.execute(p1);
		threadPoolManager.execute(p2);
		threadPoolManager.execute(p3);
		
		
	}

}
