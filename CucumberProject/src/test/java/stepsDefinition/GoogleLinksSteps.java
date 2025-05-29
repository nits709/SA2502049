package stepsDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleLinksSteps {

	WebDriver driver;

	@Given("I open GooglePage {string}")
	public void i_open_google_page(String url) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);

	}

	@When("I Click on Gmail Link")
	public void i_click_on_gmail_link() {
		driver.findElement(By.linkText("Gmail")).click();
	}

	@Then("Gmail Page should be opened")
	public void gmail_page_should_be_opened() {
		Assert.assertTrue(driver.getTitle().contains("Gmail"));
	}

	@When("I click on Image Link")
	public void i_click_on_image_link() {
		driver.findElement(By.linkText("Images")).click();
	}

	@Then("Gmail Image page should be displayed")
	public void gmail_image_page_should_be_displayed() {
		Assert.assertTrue(driver.getTitle().contains("Images"));
	}

	@When("I click on Advert Link")
	public void i_click_on_advert_link() {
		driver.findElement(By.linkText("Advertising")).click();
	}

	@Then("Advert page should be displayed")
	public void advert_page_should_be_displayed() {
		Assert.assertTrue(driver.getTitle().contains("Advertising"));
	}

	@When("I click on Business Link")
	public void i_click_on_business_link() {
		driver.findElement(By.linkText("Business")).click();
	}

	@Then("Business page should be displayed")
	public void business_page_should_be_displayed() {
		Assert.assertTrue(driver.getTitle().contains("Business"));
	}

	@When("Close Browser")
	public void userCloseBrowser() {
		driver.close();

	}
}
