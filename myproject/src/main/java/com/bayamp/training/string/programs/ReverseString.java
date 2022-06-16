package com.bayamp.training.string.programs;

public class ReverseString {

	public static void main(String[] args) {

		String originalString = "i am a boy";
		String newStringWithNoSpaces = originalString.replaceAll(" ", "");

		System.out.println("Orignal String  : " + originalString);
		System.out.println("New String  : " + newStringWithNoSpaces);

		//Reverse to orignal string with no spaces
		StringBuffer bufferReversedWithNoSpaces = new StringBuffer(newStringWithNoSpaces);
		bufferReversedWithNoSpaces.reverse();
		System.out.println("Reversed String with no spaces is :" + bufferReversedWithNoSpaces);

		
		//Create a new String by appending spaces where the orignal string has spaces 
		StringBuilder builder = new StringBuilder();
		int counter = 0;

		for (int i = 0; i < originalString.length(); i++) {

			char c = originalString.charAt(i);

			if (Character.isWhitespace(c)) {
				builder.append(" ");
			} else {
				char charToAppend = bufferReversedWithNoSpaces.charAt(counter);
				builder.append(charToAppend);
				counter++;

			}

		}

		System.out.println(builder);
	}

}
