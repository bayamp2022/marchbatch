package com.bayamp.team.harish.playground;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReadJSONFileProgram {

	public static void main(String[] args) throws IOException {
	
		File myJsonFile = new File("src/main/resources/test-data/json/CONTACT-SERVICE/GET/expected-single-contact.json");
		
		String fileContentAsString = FileUtils.readFileToString(myJsonFile);
		
		System.out.println("Expected JSON Response BODY :\n"+fileContentAsString);

	}

}
