package com.MDMC.API;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;

import com.MDMC.utils.APIConstants;
import com.MDMC.utils.CommonMethods;


public class CreatBugOnJiraAPI {

	
	private static RequestSpecification request;
	private Response response;
	private static String id;

	@Given("user calls createIssue API")
	public void user_calls_createIssue_API() {

		request = given().header("Content-Type", "application/json").header("Cookie",
				APIAuthenticationSteps.SeasionID);

		request.body(CommonMethods.readJson("C:\\Users\\janyz\\eclipse-workspace\\MethodistDallasMedicalCenter\\src\\test\\resources\\JSONFiles\\createIssue.json"));
	}

	
	@When("User retrieves response")
	public void user_retrieves_response() {

		response = request.when().post(APIConstants.CREATE_ISSUE_URI);
		response.prettyPrint();
		id=response.jsonPath().getString("id");
		
	}

	
	@Then("status code is {int}")
	public void status_code_is(int int1) {
		
		Assert.assertEquals(int1, response.getStatusCode());
		response.then().assertThat().statusCode(int1);
	}

	
	
	
	
	@Given("user calls addComment API")
	public void user_calls_addComment_API() {

		request = given().header("Content-Type", "application/json").header("Cookie",
				APIAuthenticationSteps.SeasionID);

		request.body(CommonMethods.readJson("C:\\Users\\janyz\\eclipse-workspace\\MethodistDallasMedicalCenter\\src\\test\\resources\\JSONFiles\\addComment.json"));
	}

	
	@When("User retrieves the comment response")
	public void user_retrieves_the_comment_response() {

		response = request.when().post(APIConstants.ADD_COMMENT_URI+id+"/comment");
		response.prettyPrint();
		
	}

	
	@Then("status code for comment is {int}")
	public void status_code_for_comment_is(int int1) {
		
		Assert.assertEquals(int1, response.getStatusCode());
		response.then().assertThat().statusCode(int1);
	}

}
