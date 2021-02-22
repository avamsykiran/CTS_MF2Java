package com.cts.gcd.service;

public class Swapper {

	public static <T> void swap(T e1,T e2) {
		System.out.println("Before Swap: \n" + e1 + "\n" + e2);
		T temp;
		temp = e1;
		e1=e2;
		e2=temp;
		System.out.println("After Swap: \n" + e1 + "\n" + e2);
	}
}

/*public class Swapper<T> {

	public void swap(T e1,T e2) {
		System.out.println("Before Swap: \n" + e1 + "\n" + e2);
		T temp;
		temp = e1;
		e1=e2;
		e2=temp;
		System.out.println("After Swap: \n" + e1 + "\n" + e2);
	}
}*/
