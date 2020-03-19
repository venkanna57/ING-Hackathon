package com.hcl.ing.stepdefination;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;



//import com.hcl.demo.StepDefinition.DataTable;
//import com.hcl.demo.StepDefinition.Then;

import static io.restassured.RestAssured.*;

import java.io.FileWriter;

import io.restassured.RestAssured;
import io.restassured.internal.support.FileReader;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Data_Pages {

	static Response response;
	public static void GetBaseURI()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://api-pub.bitfinix.com/v2/tickers?symbols=tBTCUSD";
	}
	
	public static void getbase_URL_for_Get_Operations()
	{
		//RestAssured.basePath ="https://api-pub.bitfinix.com/v2/tickers?symbols={tBTCUSD}";
		
		
		response = given().when().get();
		System.out.println("Get Response for tickername :-"+response);

		
		
	}
	
	
	
	public static void Validate_Get_Operations()
	{
		
		
	}
	}
