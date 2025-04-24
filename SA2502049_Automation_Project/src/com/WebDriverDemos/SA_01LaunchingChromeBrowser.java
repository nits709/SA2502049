package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_01LaunchingChromeBrowser {

	public static void main(String[] args) {
		// create an object of Webdriver.
		
		// interfaceClassName object = new ClassName();
		WebDriver driver = new ChromeDriver(); // checked compilation error.
		
		// launch the URL get() method which help to launch the URL
		driver.get("https://www.google.com");
		

	}

}
