package com.cts.jud.service.arithmeticoperationstest;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(ArithmeticOperationsSumTest.class)
@ExcludeTags({"st3","st4"})
public class SelectedTestCasesOnlySuit {

}
