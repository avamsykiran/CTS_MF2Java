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

import com.cts.jud.exception.InvalidDivisorException;
import com.cts.jud.service.ArithmeticOperations;

public class ArithmeticOperationsQutTest {

	ArithmeticOperations ao;
	
	@BeforeEach
	void startUp() {
		 ao= new ArithmeticOperations();
	}
	
	@AfterEach
	void cleanUp() {
		ao=null;
	}
		
	@ParameterizedTest
	@CsvSource(value = {"10@10@1","0@10@-0","-10@-10@1"},delimiter = '@')
	void prodTest(int td1,int td2,int expected) throws InvalidDivisorException {
		assertEquals(expected, ao.qut(td1, td2));
	}
	
	@Test	
	@DisplayName("prod should throw InvalidDivisorException given 0 as divisor")
	void prodTes2t() {
		assertThrows(InvalidDivisorException.class,()->{
			ao.qut(10,0);			
		} );
	}
	
}
