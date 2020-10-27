package com.MDMC.API;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.MDMC.utils.APIConstants;
import com.MDMC.utils.CommonMethods;
public class APIAuthenticationSteps {

	private Response response;
	public static String SeasionID;
	private static RequestSpecification request;
	
	String generateSeasionIdURI = "http://localhost:8081/rest/auth/1/session";
	
	@Given("user generates seasion ID")
	public void user_generates_seasion_ID() {
		
		request=given().header("Content-Type", "application/json");
		
		response = request.body(CommonMethods.readJson(APIConstants.GENERATE_SEASIONID_JSON)).when().post(generateSeasionIdURI);
		
		SeasionID = "JSESSIONID=" + response.jsonPath().getString("session.value");

		System.out.println(SeasionID);
	}
}
