package com.cts.jud.service.arithmeticoperationstest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.cts.jud.service.ArithmeticOperations;

public class ArithmeticOperationsProdTest {

	ArithmeticOperations ao;
	
	@BeforeEach
	void startUp() {
		 ao= new ArithmeticOperations();
	}
	
	@AfterEach
	void cleanUp() {
		ao=null;
	}
	
	/*
	@ValueSource(v1,v2,v2...) supports only primitives and strings
	@NullSource used to pass a single null as a param
	@NullAndEmptySource is used to pass a null and an empty string as a param 
	@EmptySource  is used to pass an empty string as a param
	@CsvSource
	*/
	
	@ParameterizedTest
	@CsvSource({"10,10,100","-10,-10,100","10,-10,-100","1,10,10","0,100,0"})
	void prodTest(int td1,int td2,int expected) {
		assertEquals(expected, ao.product(td1, td2));
	}
	
}
