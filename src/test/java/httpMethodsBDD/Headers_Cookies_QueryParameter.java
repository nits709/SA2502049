package httpMethodsBDD;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Headers_Cookies_QueryParameter {
	
	String reqres_URL = "https://reqres.in/api/users?page=2";
	
	@Test
	public void headersTest() {
		
		given().when().get(reqres_URL).then().statusCode(200).log().headers();
		
//		Response res = given().when().get(reqres_URL);
//				System.out.println("Print header "+ res.header("X-Powered-By"));
//				System.out.println("Print header "+ res.header("Content-Type"));
	}

	@Test
	public void queryParameterTest() {
		
		given().header("x-api-key","reqres-free-v1")
		.pathParam("path", "users")
		.queryParam("page","1")
		.when()
		.get("https://reqres.in/api/{path}")
		.then().statusCode(200)
		.log().all();

	}
	
	//AEC=AVh_V2icGwkMTo2FEyuxE3it6x7coPO-ERtIWyofUdzD7v09jD4jgucfog
	//AVh_V2ged2i9K7eoqGa9aYR8dBc5pXFpu_aI1HozO_YVwspQ3t5ZzMwpNJc
	
	@Test
	public void cookiesTest() {
		
		
		
		given().when().get("https://google.co.in").then().log().cookies();
		
		// to get and print specific coookies from response. Home work.
		
		
		
		
		
		
		
		
	}

}
