package httpMethodsBDD;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;



// POJO = Plan old java object (encapsulation data+function and hiding internal mechanism)
//getter and setter
public class PostRequestWithpayload {
	
	String post_req = "https://reqres.in/api/users";
	
  @Test
  public void postRequestWithBasicPayloads() {
	  
	  
	//  String post_req = "https://reqres.in/api/users";
	  
	  			Response res =	given().header("x-api-key","reqres-free-v1").body("{\n"
	  						+ "    \"name\": \"Rest Assured\",\n"
	  						+ "    \"job\": \"API Automation Architecture\"\n"
	  						+ "}").when().post(post_req);
	  			
	  			
	  			//validate status code
	  			Assert.assertEquals(res.getStatusCode(), 201);
	  			System.out.println("res code "+ res.getStatusCode());
	  			
	  			
	  			res.then().log().body();
	  				
  }
  
  @Test
  public void postRequestHashMapPayloads() {
	  	HashMap<String,Object> data = new HashMap<String,Object>();
	  	data.put("name", "Abhishek");
	  	data.put("Job","Senior frontend Architect");
	  	
	  	
	  	given().header("x-api-key","reqres-free-v1").contentType("application/json")
	  	.body(data)
	  	.when().post(post_req).then().statusCode(201).log().body();
	  
  }
  
  
  @Test
  public void postrequestWithPojoData() {
	  
	  pojoData pdata = new pojoData();
	  pdata.setName("John Doe");
	  pdata.setJob("SFCC Architect");
	  
	  
	  given().header("x-api-key","reqres-free-v1").contentType("application/json")
	  	.body(pdata)
	  	.when().post(post_req).then().statusCode(201)
	  	.body("name",equalTo("John Doe")).log().body();
	 
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
