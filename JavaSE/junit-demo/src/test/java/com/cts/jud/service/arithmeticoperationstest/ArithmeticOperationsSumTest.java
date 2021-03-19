package com.cts.jud.service.arithmeticoperationstest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.cts.jud.service.ArithmeticOperations;

public class ArithmeticOperationsSumTest {

	ArithmeticOperations ao;
	
	@BeforeAll
	static void commonStartUp() {
		System.out.println("Testing are being executed...!");
	}
	
	@AfterAll
	static void commonCleanUp() {
		System.out.println("Testing completed");
	}
	
	@BeforeEach
	void startUp() {
		System.out.println("Start Up Called");
		 ao= new ArithmeticOperations();
	}
	
	@AfterEach
	void cleanUp() {
		ao=null;
		System.out.println("Clean Up Called");
	}
	
	@Test	
	@DisplayName("sum should return 50 given 10 and 40")	
	@Tag("st1")
	void sumTest1() {
		int td1=10;
		int td2=40;
		int expected=50;
		int actual = ao.sum(td1, td2);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("sum should return 40 given 0 and 40")
	@Tag("st2")
	void sumTest2() {
		int td1=0;
		int td2=40;
		int expected=40;
		int actual = ao.sum(td1, td2);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("sum should return -50 given -10 and -40")
	@Tag("st3")
	void sumTest3() {		
		int td1=-10;
		int td2=-40;
		int expected=-50;
		int actual = ao.sum(td1, td2);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("sum should return -10 given 30 and -40")
	//@Disabled
	@Tag("st4")
	void sumTest4() {
		int td1=30;
		int td2=-40;
		int expected=-10;
		int actual = ao.sum(td1, td2);
		assertEquals(expected, actual);
	}
}
