package api_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_LISTUSERS {

	
	//Rest Assured is class in rest Assured Library
	// Response is special class in restassured (interface)
	
	String reqres_URL = "https://reqres.in/api/users?page=2";
	
	
	
	@Test
	public void getAPI() {
		
		Response res = RestAssured.get(reqres_URL);
		
//		System.out.println("response "+ res.asString());
//		
//		System.out.println("------------------------------");
//		System.out.println(res.asPrettyString());
		
		System.out.println(res.statusCode()); // return the status code.
		
		System.out.println("Header "+res.getHeader("Content-Type"));
		
		int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode,201, "Actual Status code is not matched as expected, please verify");
		
		
		
	}

}
