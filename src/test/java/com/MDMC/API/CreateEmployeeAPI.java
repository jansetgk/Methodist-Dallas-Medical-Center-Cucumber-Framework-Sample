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


public class CreateEmployeeAPI {

	
	private static RequestSpecification request;
	private Response response;

	@Given("user calls createEmployee API")
	public void user_calls_createEmployee_API() {

		request = given().header("Content-Type", "application/json").header("Authorization",
				APIAuthenticationSteps.Token);

		request.body(CommonMethods.readJson("C:\\Users\\janyz\\eclipse-workspace\\MethodistDallasMedicalCenter\\src\\test\\resources\\JSONFiles\\createEmployee.json"));
	}

	
	@When("User retrieves response")
	public void user_retrieves_response() {

		response = request.when().post(APIConstants.CREATE_EMPLOYEE_URI);
		response.prettyPrint();
	}

	
	@Then("status code is {int}")
	public void status_code_is(int int1) {
		
		Assert.assertEquals(int1, response.getStatusCode());
		response.then().assertThat().statusCode(int1);
	}

	
	@Then("user validates employee is created")
	public void user_validates_employee_is_created() {

		response.then().body("Message", equalTo("Entry Created"));
		response.then().body("Employee[0].emp_firstname", equalTo("Janset"));

	}

}
