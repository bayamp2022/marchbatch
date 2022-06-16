package com.bayamp.team.utils;

import java.util.Date;

public class RandomGenerator {

	/*	*//**
			 * 
			 * @return a random string of 10 numbers
			 */
	/*
	 * public static String generateRandomNumberAsString() {
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 *//**
		 * 
		 * @return a random string of requested input numbers
		 */
	/*
	 * public static String generateRandomNumberAsString(int number) {
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 *//**
		 * 
		 * @return a random string of 10 alphanumeric (ex : abbfd31233#$%^&
		 */
	/*
	 * 
	 * public static String generateRandomAlphaNumericAsString( ) {
	 * 
	 * 
	 * 
	 * }
	 * 
	 *//**
		 * 
		 * @return a random phone number as a string like this format : (xxx)yyy-zzzz
		 *//*
			 * 
			 * public static String generateRandomPhoneNumber( ) {
			 * 
			 * 
			 * 
			 * }
			 */

	/**
	 * 
	 * @return a random phone number as a string like this format : (xxx)yyy-zzzz
	 */

	public static String generateRandomSSNNumber() {

		return "445-45-5577";

		
	}
	
	public static String getTodaysDate() {
		
		Date myDate = new Date();
		
		return myDate.toString();
	}
	/*
		*//**
			 * 
			 * @return a random first as a string like this format : TestUserFirst3445
			 */
	/*
	 * 
	 * public static String generateRandomFirstName() {
	 * 
	 * }
	 * 
	 *//**
		 * 
		 * @return a random first as a string like this format : TestUserFirst3445
		 *//*
			 * 
			 * public static String generateRandomLastName() {
			 * 
			 * }
			 */

}
