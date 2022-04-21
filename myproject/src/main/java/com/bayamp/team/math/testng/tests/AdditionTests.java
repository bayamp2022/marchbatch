package com.bayamp.team.math.testng.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.bayamp.team.math.utils.AdditionLib;

public class AdditionTests {
	
	private SoftAssert softAsset = new SoftAssert();
	
	
	@Test
	public void addTwoPositiveNumbersTest( ) {
		
		int inputNumber1 = 25;
		int inputNumber2 = 45;
		
		Reporter.log("Input Numbers : " + inputNumber1 + "," + inputNumber2, true);
		int expectedTotal = 70;
		
		Reporter.log("Expected Total : " + expectedTotal,true);
		
		int actualTotal = AdditionLib.addTwoNumbers(inputNumber1, inputNumber2);
		
		Reporter.log("Received  Total from developers Library : " + actualTotal, true);
		
		Reporter.log("Perform Validations",true);
		
		softAsset.assertEquals(actualTotal, expectedTotal,"Expected total :" + expectedTotal+" is NOT SAME as actual total :" + actualTotal);
		
		Reporter.log("Expected total =" + expectedTotal+" Actual total =" + actualTotal,true);
		
		softAsset.assertAll();
	}
	
	
	@Test
	public void addTwoNegativeNumbersTest( ) {
		
		int inputNumber1 = -25;
		int inputNumber2 = -45;
		
		Reporter.log("Input Numbers : " + inputNumber1 + "," + inputNumber2, true);
		int expectedTotal = -70;
		
		Reporter.log("Expected Total : " + expectedTotal,true);
		
		int actualTotal = AdditionLib.addTwoNumbers(inputNumber1, inputNumber2);
		
		Reporter.log("Received  Total from developers Library : " + actualTotal, true);
		
		Reporter.log("Perform Validations",true);
		
		softAsset.assertEquals(actualTotal, expectedTotal,"Expected total :" + expectedTotal+" is NOT SAME as actual total :" + actualTotal);
		
		Reporter.log("Expected total =" + expectedTotal+" Actual total =" + actualTotal,true);
		
		softAsset.assertAll();
	}
	
	@Test
	public void addTwoMixedNumberWithHighestPositiveTest( ) {
		
		int inputNumber1 = -25;
		int inputNumber2 = 45;
		
		Reporter.log("Input Numbers : " + inputNumber1 + "," + inputNumber2, true);
		int expectedTotal = 20;
		
		Reporter.log("Expected Total : " + expectedTotal,true);
		
		int actualTotal = AdditionLib.addTwoNumbers(inputNumber1, inputNumber2);
		
		Reporter.log("Received  Total from developers Library : " + actualTotal, true);
		
		Reporter.log("Perform Validations",true);
		
		softAsset.assertEquals(actualTotal, expectedTotal,"Expected total :" + expectedTotal+" is NOT SAME as actual total :" + actualTotal);
		
		Reporter.log("Expected total =" + expectedTotal+" Actual total =" + actualTotal,true);
		
		softAsset.assertAll();
	}

	@Test
	public void addTwoMixedNumberWithHighestNegativeTest( ) {
		
		int inputNumber1 = 25;
		int inputNumber2 = -45;
		
		Reporter.log("Input Numbers : " + inputNumber1 + "," + inputNumber2, true);
		int expectedTotal = -20;
		
		Reporter.log("Expected Total : " + expectedTotal,true);
		
		int actualTotal = AdditionLib.addTwoNumbers(inputNumber1, inputNumber2);
		
		Reporter.log("Received  Total from developers Library : " + actualTotal, true);
		
		Reporter.log("Perform Validations",true);
		
		softAsset.assertEquals(actualTotal, expectedTotal,"Expected total :" + expectedTotal+" is NOT SAME as actual total :" + actualTotal);
		
		Reporter.log("Expected total =" + expectedTotal+" Actual total =" + actualTotal,true);
		
		softAsset.assertAll();
	}

}
