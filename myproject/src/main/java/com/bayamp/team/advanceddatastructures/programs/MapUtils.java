package com.bayamp.team.advanceddatastructures.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUtils {

	public static Map<String, String> createMap() {

		Map<String, String> countryCapitalsMap = new HashMap<String, String>();

		countryCapitalsMap.put("India", "Delhi");
		countryCapitalsMap.put("China", "Beijing");
		countryCapitalsMap.put("France", "Paris");
		countryCapitalsMap.put("UK", "London");
		countryCapitalsMap.put("Spain", "Portugal");
		countryCapitalsMap.put("India", "New Delhi");

		return countryCapitalsMap;

	}

	public static void retrieveTheMap(Map<String, String> myMap) {

		// why ?? Map is an interface
		myMap.put("India", "Delhi");
		myMap.put("China", "Beijing");
		myMap.put("France", "Paris");
		myMap.put("UK", "London");
		myMap.put("Spain", "Portugal");
		myMap.put("India", "New Delhi");

		System.out.println("The size of the map is :" + myMap.size());

		// System.out.println("The capital of India is :" +
		// countryCapitalsMap.get("India"));

		// System.out.println("The capital of France is :" +
		// countryCapitalsMap.get("France"));

		System.out.println("\nIterate through the key set");
		
		Set<String> countryKeySet = myMap.keySet();
		
//		for (String country : countryKeySet) {
//			System.out.println("\nThe country name is :" + country);
//			// String capital = countryCapitalsMap.get(country);
//			System.out.println("The capital name is :" + myMap.get(country));
//		}
		
		Iterator setItr =  countryKeySet.iterator();
		
		while(setItr.hasNext()) {
			
			String key = (String) setItr.next();
			String capital = myMap.get(key);
		}

	}
}
