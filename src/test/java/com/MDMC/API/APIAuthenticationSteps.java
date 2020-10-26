package com.MDMC.API;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.MDMC.utils.APIConstants;
import com.MDMC.utils.CommonMethods;
public class APIAuthenticationSteps {

	private Response response;
	public static String Token;
	private static RequestSpecification request;
	
	String generateTokenURI = "http://18.232.148.34/syntaxapi/api/generateToken.php";
	
	@Given("user generates token")
	public void user_generates_token() {
		
		request=given().header("Content-Type", "application/json");
		
		response = request.body(CommonMethods.readJson(APIConstants.GENERATE_TOKEN_JSON)).when().post(generateTokenURI);
		
		Token = "Bearer " + response.jsonPath().getString("token");

		
	}
}
