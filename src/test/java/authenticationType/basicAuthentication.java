package authenticationType;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;



public class basicAuthentication {
	
	String username = "postman";
	String password = "password";
	
	
	@Test
	public void baseAuthenticationtest() {
				Response res = given().auth().basic(username, password)
				.when().get("https://postman-echo.com/basic-auth");
				
				res.then().log().body();
				boolean status =res.jsonPath().getBoolean("authenticated");
				Assert.assertEquals(status,true);
				
				
	}

}
