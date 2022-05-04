package com.bayamp.team.restapi.get.contact;


import org.json.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.restapi.util.ResponseMessage;
import com.bayamp.restapi.util.RestUtil;


public class GetSingleContactTest {

	@Test
	public void getValidContactTest() {

		int expectedResponseCode = 200; 
		
		String expectedIDRegex = "\\w{24}";
		ResponseMessage getSingleContactResponse = RestUtil.executeGET("/contacts/6088d6aa937a000015f27c17");
		
		int responseStatusCode = getSingleContactResponse.getResponseStatusCode();
	
		
		Reporter.log("Expected Response status code to be : " + expectedResponseCode, true);
		
		Reporter.log("Actual Response status code received : " + responseStatusCode, true);
		
		//Validate response code
		Reporter.log("Validate response code", true);
		Assert.assertEquals(responseStatusCode,expectedResponseCode);
		
		Reporter.log("Actual Response status code is same as expected response code", true);
	
		
		JSONObject reponseJSON = getSingleContactResponse.getResponseBody();
	
		
		Reporter.log("Response body :\n" +	reponseJSON.toString(2),true);
		
		String id = reponseJSON.get("id").toString();
		
		int lengthOfID = id.length();
		
		Reporter.log("ID of the contact is :" + id,true);
		
		//Validate ID of the response
		Reporter.log("Validate ID", true);
		
		Assert.assertEquals(lengthOfID,24);
		
		Assert.assertTrue(id.matches(expectedIDRegex),"Expected regex for ID :" + expectedIDRegex);
		
		//Reporter.log("Status received => " + getSingleContactResponse.getStatusLine(),true); 
		//Reporter.log("Response=>" + getSingleContactResponse.prettyPrint(),true);
	
		//Get the BODY
		
		//PrintStream p = System.out;
	//	p.println("Hello oWOrld");
		
		
		System.out.println("Hello World");
	}
	
	@Test
	public void getInValidContactTest() {
		

		int expectedResponseCode = 404; 
		
		ResponseMessage getSingleContactResponse = RestUtil.executeGET("/contacts/6000d6aa603a000015i27c17");
		
		int responseStatusCode = getSingleContactResponse.getResponseStatusCode();
	
		
		Reporter.log("Expected Response status code to be : " + expectedResponseCode, true);
		
		Reporter.log("Actual Response status code received : " + responseStatusCode, true);
		
		Assert.assertEquals(responseStatusCode, expectedResponseCode);
		
	}
}
