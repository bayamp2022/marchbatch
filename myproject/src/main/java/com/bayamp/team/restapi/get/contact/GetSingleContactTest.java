package com.bayamp.team.restapi.get.contact;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetSingleContactTest {

	private RequestSpecification httpRequest;

	@BeforeClass
	public void init() {
		RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
		httpRequest = RestAssured.given();

	}

	@Test
	public void getValidContactTest() {

		int expectedResponseCode = 200;

		String expectedIDRegex = "\\w{24}";
		Response getSingleContactResponse = httpRequest.get("/contacts/6088d6aa937a000015f27c17");

		int responseStatusCode = getSingleContactResponse.getStatusCode();

		Reporter.log("Expected Response status code to be : " + expectedResponseCode, true);

		Reporter.log("Actual Response status code received : " + responseStatusCode, true);

		// Validate response code
		Reporter.log("Validate response code", true);
		Assert.assertEquals(responseStatusCode, expectedResponseCode);

		Reporter.log("Actual Response status code is same as expected response code", true);

		JSONObject reponseJSON = new JSONObject(getSingleContactResponse.getBody().toString());

		Reporter.log("Response body :\n" + reponseJSON.toString(2), true);

		String id = reponseJSON.get("id").toString();

		int lengthOfID = id.length();

		Reporter.log("ID of the contact is :" + id, true);

		// Validate ID of the response
		Reporter.log("Validate ID", true);

		Assert.assertEquals(lengthOfID, 24);

		Assert.assertTrue(id.matches(expectedIDRegex), "Expected regex for ID :" + expectedIDRegex);

		// Reporter.log("Status received => " +
		// getSingleContactResponse.getStatusLine(),true);
		// Reporter.log("Response=>" + getSingleContactResponse.prettyPrint(),true);

		// Get the BODY

		// PrintStream p = System.out;
		// p.println("Hello oWOrld");

	}

}
