package com.bayamp.team.generic;

public class Constants {
	
	public static class REST_API {
	//GET
	public static final int HTTP_OK_RESPONSE_CODE = 200;
	public static final String HTTP_OK_RESPONSE_MESSAGE = "OK";
	
	//POST
	public static final int HTTP_CREATED_RESPONSE_CODE = 201;
	public static final String HTTP_CREATED_RESPONSE_MESSAGE = "Created";
	
	
	//PUT
	public static final int HTTP_ACCEPTED_RESPONSE_CODE = 202;
	public static final String HTTP_ACCEPTED_RESPONSE_MESSAGE = "Accpeted";
	
	public static final String EXPECTED_ID_REGEX = "\\w{24}";
	}

}
