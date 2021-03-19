package com.cts.jud.service;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import com.cts.jud.service.arithmeticoperationstest.ArithmeticOperationsProdTest;
import com.cts.jud.service.arithmeticoperationstest.ArithmeticOperationsQutTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({ArithmeticOperationsQutTest.class,ArithmeticOperationsProdTest.class})
public class ArthOptDiffAndProdSuit {

}
