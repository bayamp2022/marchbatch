package com.bayamp.team.utils;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RandomSSNTest {
	
	@Test
	public static void ssnTest( ) {
		
		
		System.out.println(RandomGenerator.getTodaysDate());
		
	//	String name = "\"jason\"";
		
	//	System.out.println(name);
		
		String expectedSSNFormat = "\\d{3}-\\d{2}-\\d{4}";
		
		String actualSSNReceived = RandomGenerator.generateRandomSSNNumber();
	
		
		boolean check = actualSSNReceived.matches(expectedSSNFormat);
		
		
		Assert.assertTrue(check);
		
		Reporter.log("Test Case Passsed : Expected format " + expectedSSNFormat +" matches the actual value :" + actualSSNReceived,true);


	}
	
	

}
