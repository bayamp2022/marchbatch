package com.bayamp.team.advanceddatastructures.programs;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicatesInAString {

	public static void main(String[] args) {

		//String str = "abczddaaabbydddeeeedfffddgggaaa";
		String str = "abccda"; //a:2 , b:1 , c:2 , d:1 
		
		Set<Character> charSet = new TreeSet<Character>();
		List<Character> dupCharList = new LinkedList<Character>();
		
		char[] allChars = str.toCharArray();
		

		for(char myChar : allChars) {
			
			boolean foundDup = charSet.add(myChar);
			
			if(!foundDup) {
				dupCharList.add(myChar);
				
			}
			
		}
		
		
		System.out.println("All characters :" + charSet);
		System.out.println("Duplicate characters :" + dupCharList);

	}

}
