package com.bayamp.team.advanceddatastructures.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindTotalUsingMap {
	
	public static void main(String[] args) {
		
		int[] myArray = {2,8,9,12,3,10,7,15,22,6,4,1};
		
		int givenTotal = 10;
		
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Map<Integer,Integer> pairsMap = new TreeMap<Integer,Integer>(); // {2=8,7=3,6=4,9=1 
		
		
		for(int firstNumber : myArray) {
			
			int secondNumber = givenTotal - firstNumber;
			
			if(map.containsKey(secondNumber)) {
				pairsMap.put(firstNumber,secondNumber);
			}else {
				map.put(firstNumber,secondNumber); //2,
			}
			
		}
		
		System.out.println(map.toString());
		System.out.println(pairsMap.toString());
		
		
	}

	
	
	
}
