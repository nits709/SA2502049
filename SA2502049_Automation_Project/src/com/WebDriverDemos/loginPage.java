package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	// PageFactory
	static @FindBy(id = "email") WebElement login_Id;
	static @FindBy(id = "pass") WebElement login_pass;
	static @FindBy(name = "login") WebElement login_submit;

	static WebDriver dr;

	public static void main(String[] args) {

		dr = new ChromeDriver();
		PageFactory.initElements(dr, loginPage.class); // until call this findby function won't work
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		login();

	}

	public static void login() {
		login_Id.sendKeys("nitingupta@gmail.com");
		login_pass.sendKeys("XXXXXXYYYYY");
		login_submit.click();
	}
}
