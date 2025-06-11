package authenticationType;


import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class BearerTokenAuthentication {

	
	//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
	
	
	@Test
	public void bearerTokenTest() {
		String btoken = "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";
		
		
		Response res = given().header("Authorization","Bearer "+btoken)
		.when().get("https://api.github.com/user/repos");
		
		
		res.then().log().all();
	}
}
