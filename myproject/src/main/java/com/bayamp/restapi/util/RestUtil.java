package com.bayamp.restapi.util;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestUtil {
	

	private static RequestSpecification httpRequest;
	
	private static final String BASE_URL = "https://bayamp-rest-api-contacts.herokuapp.com";
	

	private static void initRestAssured() {
		RestAssured.baseURI = BASE_URL;
		// Get the RequestSpecification of the request to be sent to the server. 
		httpRequest = RestAssured.given();
		
	}
	
	public static ResponseMessage executeGET(String endPoint) {
		initRestAssured();
		
		Response getSingleContactResponse = httpRequest.get(endPoint);
		
		int responseStatusCode = getSingleContactResponse.getStatusCode();
		
		ResponseBody body = getSingleContactResponse.getBody();
		
		String bodyAsString = body.asString();
				
		ResponseMessage responseMessage = new ResponseMessage(responseStatusCode,bodyAsString);
		
		return responseMessage;
		
	}
	
	public static Response executePOST(String endPoint) {
		initRestAssured();
		return null;
		
	}
	
	public static Response executePUT(String endPoint) {
		initRestAssured();
		return null;
		
	}
	
	
	public static Response executeDELETE(String endPoint) {
		initRestAssured();
		return null;
		
	}
	


}
