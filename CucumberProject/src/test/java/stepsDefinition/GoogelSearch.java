package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogelSearch {

	WebDriver driver;

	@Given("Launch google URl on Browser")
	public void launch_google_u_rl_on_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.co.in");
	}

	@When("Enter data for search in search box")
	public void enter_data_for_search_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Sachin Tendulkar");
	}

	@When("Hit Enter")
	public void hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("valid Search result shoult display")
	public void valid_search_result_shoult_display() {
		driver.getTitle().contains("Sachin");
	}

}
