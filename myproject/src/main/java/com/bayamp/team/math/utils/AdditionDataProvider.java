package com.bayamp.team.math.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class AdditionDataProvider {

	@DataProvider(name = "myData")
	public Object[][] myData() throws IOException, CsvException {

		// Object[][] myData = { {25,45,70} ,{-25,-45, -70}};

		// using java file io read the file ./myfiles/AdditionData.csv
		// some how get to total row count - 1 = 2
		// get column count = 3

		String fileName = "./src/main/resources/myfiles/AdditionData.csv";
		CSVReader reader = new CSVReader(new FileReader(fileName));
		
		List<String[]> allRows = reader.readAll();
		
		int dataRows = allRows.size() - 1;
		
		String[] firstRow = allRows.get(0);
		
		int columns = firstRow.length;
	
		//String arrayData = Arrays.toString(firstRow);
		
		System.out.println("Number Of Columns " + columns);
		
		
		 Object[][] myData = new Object[dataRows][columns];
		 
		int rowCount = 0;
	    for (int i = 1; i < allRows.size(); i++) {
	    	
	    	String[] row = allRows.get(i);
	    	
	    	String number1 = row[0];
	    	String number2 = row[1];
	    	String number3 = row[2];
	    	
	    	int firstNumber = Integer.parseInt(number1);
	    	int secondNumber = Integer.parseInt(number2);
	    	int expectedTotal = Integer.parseInt(number3);
	    	
	    	myData[rowCount][0] = firstNumber;
	    	
	    	myData[rowCount][1] = secondNumber;
	    	
	    	myData[rowCount][2] = expectedTotal;
	    	
	    	rowCount++;
		}
		
		
		return myData;

	}

}
