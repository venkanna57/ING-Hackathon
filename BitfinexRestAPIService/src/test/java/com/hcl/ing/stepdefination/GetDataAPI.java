package com.hcl.ing.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class GetDataAPI {

	@Given("GetBase URL for Get Operations")
	public void getbase_URL_for_Get_Operations() {
		
		GET_Data_Pages.GetBaseURI();
	}
	    
	

	@When("Send the Request for Get Operations")
	public void send_the_Request_for_Get_Operations() {
		
		GET_Data_Pages.getbase_URL_for_Get_Operations();
	   
	}

	@Then("Validate the Get Operations")
	public void validate_the_Get_Operations() {
		
		
		GET_Data_Pages.Validate_Get_Operations();
	
	}
	
}
