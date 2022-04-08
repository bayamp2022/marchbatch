package com.bayamp.team.advanceddatastructures.programs;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesInAString {

	public static void main(String[] args) {

		String str = "abczddaaabbydddeeeedfffddgggaaa";
		//String str = "abccda"; //a:2 , b:1 , c:2 , d:1 
		//dup map : a:2, c:2
		
		char[] allCharsInStr = str.toCharArray();
		
		Map<Character,Integer> charCountMap = new HashMap<Character,Integer>();  //{ a : 1 , b:1 ,c:1,d:1
		
		Map<Character,Integer> duplicateCharCountMap = new HashMap<Character,Integer>();// {d:2 , a:2
		
		
		//for(char myCharacter : allCharsInStr) {
		for(int i=0;i<str.length();i++) {
			char myCharacter = str.charAt(i);
			
			if(charCountMap.containsKey(myCharacter)) {
				int oldCount = charCountMap.get(myCharacter);
				duplicateCharCountMap.put(myCharacter,oldCount+1);
				charCountMap.put(myCharacter,oldCount+1);
			
			}else {
				charCountMap.put(myCharacter,1);
			}
			
		}
		
		System.out.println("All Char count map : " + charCountMap.toString());
		System.out.println("Duplicate Char count map : " + duplicateCharCountMap.toString());
		

	}

}
