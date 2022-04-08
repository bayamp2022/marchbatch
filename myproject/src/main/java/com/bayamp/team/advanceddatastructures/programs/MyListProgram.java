package com.bayamp.team.advanceddatastructures.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bayamp.team.userdefined.types.Book;


public class MyListProgram {

	public static void main(String[] args) {
		
		//ArrayList , LinkedList 
		
		//Data : C R U D
//	ArrayList is a dynamically growing array . its not static 
		
		List<Book> myBooKList= new LinkedList<Book>();
		
		//intiaizlie 
		//create (add values )
		//REtrieve values 
		//Updates values 
		//Not worry about delete 
		
		List<String> myFruitList = new ArrayList<String>();
		myFruitList.add("banana");
		myFruitList.add("apples");
		
		int listSize = myFruitList.size(); //liseSize = 2;

		System.out.println("The Fruit List size is :" + listSize);
		
		myFruitList.add("grapes");
		myFruitList.add("strawberrys");
		
		listSize = myFruitList.size();
		
		System.out.println("The Fruit List size is :" + listSize);
		
		//iteration or retrieveing (R part of the C R U D) 
//		for (int i = 0; i < listSize; i++) {
//			
//			System.out.println(myFruitList.get(i));
//			
//		}
		
		for(String fruit : myFruitList) {
			
			System.out.println(fruit);
		}
		
	
		//Update the fruit list 
		myFruitList.add(0, "kiwi");
			
		System.out.println("\nAfter updating by replacing the first fruit");
		
		for(String fruit : myFruitList) {
			
			System.out.println(fruit);
		}
		
		myFruitList.remove(1);
		
		
		System.out.println("\nAfter updating by removing the second fruit");
		
		for(String fruit : myFruitList) {
			
			System.out.println(fruit);
		}
	
		ArrayList<Integer> agesList = new ArrayList<Integer>();
		agesList.add(10);
		agesList.add(12);
		agesList.add(40);
		
	
	
	}

}
