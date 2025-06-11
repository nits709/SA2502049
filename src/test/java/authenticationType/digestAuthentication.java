package authenticationType;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class digestAuthentication {

	
	
	String username = "postman";
	String password = "password";
	
	
	
	// fidler - free version.
	@Test
	public void digestAuthenticationtest() {
				Response res = given().auth().digest(username, password)
				.when().get("https://postman-echo.com/basic-auth");
				
				res.then().log().body();
				boolean status =res.jsonPath().getBoolean("authenticated");
				Assert.assertEquals(status,true);
				
				
	}
}
