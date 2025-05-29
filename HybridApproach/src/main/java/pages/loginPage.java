package pages;

import org.openqa.selenium.By;

import baseFunction.baseUtil;

public class loginPage  extends baseUtil{
	
	
	final By LOCATOR_LOGIN_USERNAME = By.name("email");
	final By LOCATOR_LOGIN_PASSWORD = By.name("password");
	

	
	
	public void launchURL(String url) {
		getURL(url);
	}
	
	public void login(String username, String password) {	
		enterData(LOCATOR_LOGIN_USERNAME, username);
		enterData(LOCATOR_LOGIN_PASSWORD, password);
	}
	
	
	
	
	
	

}
