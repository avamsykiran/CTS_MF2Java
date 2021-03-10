package com.cts.threaddemo.ui;

public class MainThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}

}
