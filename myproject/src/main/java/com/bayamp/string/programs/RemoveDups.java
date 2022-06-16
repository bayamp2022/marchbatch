package com.bayamp.string.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDups {

	public static void main(String[] args) {
	
			String myStr = "aambbzccau";
			
			char[] myChars = myStr.toCharArray();
			
			Map<Character,Integer> myCharMap = new HashMap<Character,Integer>();
			List<Character> dupCharList = new ArrayList<Character>();
			
			
			String newStr="";
			
			for(char c : myChars) {
				
				if(myCharMap.containsKey(c) ) {
					int count = myCharMap.get(c);
					myCharMap.put(c, count + 1);
					dupCharList.add(c);
				}else {
					myCharMap.put(c, 1);
					newStr = newStr+c;
					
				}
			}
			
			
		System.out.println(myCharMap);
		System.out.println(dupCharList);
	
	}

}
