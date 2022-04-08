package com.bayamp.team.advanceddatastructures.programs;

public class FindTotalNotUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {2,8,9,12,3,10,7,15,22,6,4,1};
		
		String pairsString = "{";
		
		int givenTotal = 10;
		
		for(int firstNumber : myArray) {
			
			int secondNumber = givenTotal - firstNumber;
			
			boolean isPresent = searchArray(myArray , secondNumber);
			
			if(isPresent) {
				//System.out.println("Found the pair");
				pairsString = pairsString+firstNumber+":"+secondNumber+",";
			}
			
			
		}
		
		String myFinalPairString = pairsString+"}";
		myFinalPairString = myFinalPairString.replace(",}","}");
		System.out.println(myFinalPairString);
		

	}

	private static boolean searchArray(int[] myArray, int secondNumber) {
		
		for(int element : myArray) {
			
			if(element == secondNumber) {
				return true;
			}
		}
		
		return false;
	}

}
