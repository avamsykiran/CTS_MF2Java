package com.cts.lasd.ui;

import java.time.LocalDate;

import com.cts.lasd.service.Consume;
import com.cts.lasd.service.Supply;

public class LambdaDemoApp {

	public static void main(String[] args) {

		Supply today = () -> LocalDate.now().toString();		
		System.out.println(today.get());
		
		Supply orgTitle = () -> "CTS";		
		System.out.println(orgTitle.get());
		
		String s = "hello";
		Consume<String> toUpper = (str) -> {str.toUpperCase();};
		toUpper.consume(s);
	}

}
