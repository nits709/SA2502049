package stepsDefinition;

import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationExeciseLogin {

	WebDriver driver;

	@Given("The user launch the application URL {string}")
	public void the_user_launch_the_application_url(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
	}

	@When("The User enter email {string} and password {string}")
	public void the_user_enter_email_and_password(String un, String pwd) {
		driver.findElement(By.cssSelector(".login-form [name='email']")).sendKeys(un);
		driver.findElement(By.cssSelector(".login-form [name='password']")).sendKeys(pwd);
	}

	@When("The User submit the login credentials")
	public void the_user_submit_the_login_credentials() {
		driver.findElement(By.cssSelector(".login-form [data-qa='login-button']")).click();
	}

	@Then("The User validate logged in successfully")
	public void the_user_validate_logged_in_successfully() {
		System.out.println(driver.findElement(By.cssSelector(".fa.fa-user")).isEnabled());
	}
}
