package telecomeProject;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class telecomAssignements {
	
	
	String tokenValue;
	String loginToken;
	
	@Test(priority=1)
	public void addNewUser() {
		
		Response res =given().header("Content-Type","application/json")
		.body("{\n"
				+ "\"firstName\": \"Nitin\",\n"
				+ "\"lastName\": \"Automation\",\n"
				+ "\"email\": \"nitin"+System.currentTimeMillis()+"@yopmail.com\",\n"
				+ "\"password\": \"myPassword\"\n"
				+ "}")
		.when().post("https://thinking-tester-contact-list.herokuapp.com/users");
		res.then().log().body();
		
		tokenValue = res.jsonPath().getString("token");
		System.out.println("UserToken "+ tokenValue);
		System.out.println("New user created with status code "+res.statusCode());
		
	}
	
	@Test(priority=2,dependsOnMethods="addNewUser")
	public void getUserProfile() {
		Response res =		given().header("Content-Type","application/json")
					.header("Authorization","Bearer "+tokenValue)
			.when().get(" https://thinking-tester-contact-list.herokuapp.com/users/me");
		
		res.then().log().body();
		System.out.println("New user created with status code "+res.statusCode());
		
	}

}
