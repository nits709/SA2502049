package httpMethodsBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GetRequestMethod {
	
	
	String reqres_URL = "https://reqres.in/api/users?page=2";
	
	/* given() | - pre-condition  
	 * headers/ cookie/ path/query parameter/ playload(resources)/Authentication.
	 * 
	 * When()
	 * GET | POST| PUT| PATCH| DELETE
	 * 
	 * Then() - status code, message, json response, response payload(json path, format, time, /status MSG.)
	 * 
	 * log()
	 */ 
	
	
  @Test
  public void GetRequestBDD() {
	  
	  given().when().get(reqres_URL).then().statusCode(200) // 1st validation
	  .body("page",equalTo(2)) // 2nd validation
	  .body("data.id", hasItems(7,8,9,10,11,12)) // 3rd rscenario valiadtion.
	  .body("data.id",hasItems(12,10,11,7,8,9)) // checks the data exisitence in body resposne
	  .body("data.id", contains(7,8,9,10,11,12))// check order and exisitence both.
	  .body("data.id",contains(7,10,11,8,9,12))
	  .body("data[0].first_name",equalTo("key's--->value"));
	  
  }
}
