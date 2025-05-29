package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTitleSteps {

	
	

	@Given("The User Launch the Googel URL")
	public void the_user_launch_the_googel_url() {
	    System.out.println(" Launch Google URL  ");
	}

	@When("The User gets Page Title")
	public void the_user_gets_page_title() {
		System.out.println(" Reads Page Title");
	}

	@Then("The User validate Page Title")
	public void the_user_validate_page_title() {
		System.out.println("Valdiate the page title");
	}
	
	
}
