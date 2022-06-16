package com.bayamp.team.restapi.get.contact;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bayamp.team.generic.Constants;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetSingleContactTest {

	private RequestSpecification httpRequest;

	@BeforeClass
	public void init() {
		RestAssured.baseURI = "https://bayamp-rest-api-contacts.herokuapp.com";
		httpRequest = RestAssured.given();

	}

	@Test
	public void getValidContactTest() throws IOException {

		//String expectedIDRegex = "\\w{24}";
		Response getSingleContactResponse = httpRequest.get("/contacts/626ed3bb48c43e0016e18b6b");

		int responseStatusCode = getSingleContactResponse.getStatusCode();

		Reporter.log("Expected Response status code to be : " + Constants.REST_API.HTTP_OK_RESPONSE_CODE, true);

		Reporter.log("Actual Response status code received : " + responseStatusCode, true);

		// Validate response code
		Reporter.log("Validate response code", true);
		Assert.assertEquals(responseStatusCode, Constants.REST_API.HTTP_OK_RESPONSE_CODE);

		Reporter.log("Actual Response status code is same as expected response code", true);
		
		ResponseBody body = getSingleContactResponse.getBody();
		
		String bodyAsStr = body.asString();

		JSONObject actualReponseJSON = new JSONObject(bodyAsStr);

		Reporter.log("Response body :\n" + actualReponseJSON.toString(2), true);

		String id = actualReponseJSON.get("id").toString();

		int lengthOfID = id.length();

		Reporter.log("ID of the contact is :" + id, true);

		// Validate ID of the response
		Reporter.log("Validate ID", true);

		Assert.assertEquals(lengthOfID, 24);

		Assert.assertTrue(id.matches(Constants.REST_API.EXPECTED_ID_REGEX), "Expected regex for ID :" + Constants.REST_API.EXPECTED_ID_REGEX);

		//Validate Response BODY :
		Reporter.log("Validate Response BODY");
		
		File expectedJonFile = new File("src/main/resources/test-data/json/CONTACT-SERVICE/GET/expected-single-contact.json");
		String expectedContentAsString = FileUtils.readFileToString(expectedJonFile);
		
		JSONObject expectedReponseJSON = new JSONObject(expectedContentAsString);
		
		Reporter.log("Expected JSON Response BODY :\n"+expectedContentAsString,true);
		
		
		Assert.assertEquals(actualReponseJSON,expectedReponseJSON);

	}

}
