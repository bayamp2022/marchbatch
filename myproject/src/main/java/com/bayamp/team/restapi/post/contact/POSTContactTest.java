package com.bayamp.team.restapi.post.contact;

import static org.testng.Assert.assertNotNull;

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

public class POSTContactTest {

	private RequestSpecification httpRequest;

	@BeforeClass
	public void init() {
		RestAssured.baseURI = "https://bayamp-rest-api-contacts.herokuapp.com";
		httpRequest = RestAssured.given();

	}

	@Test
	public void postCreateContactTest() throws IOException {

		File inputJonFile = new File(
				"src/main/resources/test-data/json/CONTACT-SERVICE/POST/create-request-contact-body.json");
		String requestBodyAsString = FileUtils.readFileToString(inputJonFile);

		JSONObject requestBobyAsJSON = new JSONObject(requestBodyAsString);

		String inputNameFromRequestBody = requestBobyAsJSON.get("name").toString();
		String inputPhoneFromRequestBody = requestBobyAsJSON.get("phone").toString();

		httpRequest.body(requestBodyAsString);
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("accept", "*/*");

		Response postContactResponse = httpRequest.post("/contacts/");

		int responseStatusCode = postContactResponse.getStatusCode();

		Reporter.log("Expected Response status code to be : " + Constants.REST_API.HTTP_CREATED_RESPONSE_CODE, true);

		Reporter.log("Actual Response status code received : " + responseStatusCode, true);

		// Validate response code
		Reporter.log("Validate response code", true);
		Assert.assertEquals(responseStatusCode, Constants.REST_API.HTTP_CREATED_RESPONSE_CODE);

		Reporter.log("Actual Response status code is same as expected response code", true);

		// Validate response message (home )

		Reporter.log("Validate response status line", true);

		String responseMessage = postContactResponse.getStatusLine();

		Assert.assertEquals(responseMessage, "HTTP/1.1 201 Created");

		Reporter.log("Expected Response message to be : HTTP/1.1 201 Created", true);

		Reporter.log("Actual Response message received : " + responseMessage, true);

		Reporter.log("Actual Response message is same as expected response message", true);

		// Validate response body has ID

		String actualResponseBodyAsStr = postContactResponse.asString();

		JSONObject actualReponseJSON = new JSONObject(actualResponseBodyAsStr);

		Reporter.log("Response body for create POST HTTP Request:\n" + actualReponseJSON.toString(4), true);

		String id = actualReponseJSON.get("id").toString();

		int lengthOfID = id.length();
		Reporter.log("ID of the contact is :" + id, true);
		Reporter.log("Validate ID", true);

		Assert.assertEquals(lengthOfID, 24);
		Assert.assertTrue(id.matches(Constants.REST_API.EXPECTED_ID_REGEX),
				"Expected regex for ID :" + Constants.REST_API.EXPECTED_ID_REGEX);

		// Validate the presence of createdAt in the response JSON (not null)

		Reporter.log("Validate createdAt not null", true);

		String createdAt = actualReponseJSON.get("createdAt").toString();

		assertNotNull(createdAt);

		// Validate the presence of updatedAt in the response JSON (not null)

		Reporter.log("Validate updatedAt not null", true);

		String updatedAt = actualReponseJSON.get("updatedAt").toString();

		assertNotNull(updatedAt);

		// Validate the value of the name attribute in the response JSON is same as the
		// value of the name attribute in the request JSON
		String nameFromResponseObject = actualReponseJSON.get("name").toString();
		Assert.assertEquals(nameFromResponseObject, inputNameFromRequestBody);

		// Validate the value of the phone attribute in the response JSON is same as the
		// value of the phone attribute in the request JSON
		String phoneFromResponseObject = actualReponseJSON.get("phone").toString();
		Assert.assertEquals(phoneFromResponseObject, inputPhoneFromRequestBody);

	}

}
