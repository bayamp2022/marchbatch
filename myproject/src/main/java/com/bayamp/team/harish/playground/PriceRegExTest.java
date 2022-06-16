package com.bayamp.team.harish.playground;

public class PriceRegExTest {

	public static void main(String[] args) {
	
		//String actualPrice = "$369.99";
		String actualPrice = "$36.99";
		String regEx = "\\$\\d{2}\\.\\d{2}";
		
		boolean check = actualPrice.matches(regEx);
		
		System.out.println(check);
		
		

	}

}
