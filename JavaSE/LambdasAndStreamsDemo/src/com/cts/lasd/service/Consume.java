package com.cts.lasd.service;

@FunctionalInterface
public interface Consume<T> {
	void consume(T ele);
}
