package api_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JsonValidation_RestAssured {

	
	String reqres_URL = "https://reqres.in/api/users?page=2";
	
	
	@Test
	public void jsonValidationTest() {
		Response res = RestAssured.get(reqres_URL);
		
		System.out.println("Response as "+ res.asPrettyString());
		
		int pageId = res.jsonPath().get("page");
		
		Assert.assertEquals(pageId, 2,"id is not matched");
		
		
		String firstname = res.jsonPath().get("data[0].first_name");
		
		
		
		System.out.println("Page Id "+ pageId   + " : "+ "firstName "+ firstname);
		
		Assert.assertEquals(firstname,"Michael","firstname is not matched");
		
		
		String supportText = res.jsonPath().get("support.text");
		Assert.assertTrue(supportText.contains("endless"), "text is not matching, please verify");
		
		
	}
	
	
	
}
