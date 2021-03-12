package com.cts.threaddemo.ui;

import com.cts.threaddemo.service.Consumer;
import com.cts.threaddemo.service.NumberStore;
import com.cts.threaddemo.service.Producer;

public class WaitAndNotifyExample {

	public static void main(String[] args) {

		NumberStore store = new NumberStore(2);
		
		Producer p = new Producer(15, store, "prod");
		Consumer c = new Consumer(15, store, "cons");
		
		c.start();
		p.start();
	}

}
