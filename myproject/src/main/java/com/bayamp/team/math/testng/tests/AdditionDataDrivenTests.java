package com.bayamp.team.math.testng.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.bayamp.team.math.utils.AdditionLib;

public class AdditionDataDrivenTests {
	
	private SoftAssert softAsset = new SoftAssert();
	
	
	@Test(dataProvider =  "myData" ,dataProviderClass = com.bayamp.team.math.utils.AdditionDataProvider.class)
	public void addTwoPositiveNumbersTest(int inputNumber1, int inputNumber2, int expectedTotal ) {
		
		
		Reporter.log("Input Numbers : " + inputNumber1 + "," + inputNumber2, true);
		
		
		Reporter.log("Expected Total : " + expectedTotal,true);
		
		int actualTotal = AdditionLib.addTwoNumbers(inputNumber1, inputNumber2);
		
		Reporter.log("Received  Total from developers Library : " + actualTotal, true);
		
		Reporter.log("Perform Validations",true);
		
		softAsset.assertEquals(actualTotal, expectedTotal,"Expected total :" + expectedTotal+" is NOT SAME as actual total :" + actualTotal);
		
		Reporter.log("Expected total =" + expectedTotal+" Actual total =" + actualTotal,true);
		
		softAsset.assertAll();
	}
	
	
}
