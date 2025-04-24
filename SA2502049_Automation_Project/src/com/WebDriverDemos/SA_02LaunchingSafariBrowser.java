package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SA_02LaunchingSafariBrowser {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://facebook.com");
		
		Thread.sleep(2000);
		driver.close();

	}

}
