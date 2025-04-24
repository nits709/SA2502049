package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_01LaunchingChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// create an object of Webdriver.
		// class can extends class
		// interface can extend interface
		// class implements interface.
		// interfaceClassName object = new ClassName();
		WebDriver driver = new ChromeDriver(); // checked compilation error.
	
		// launch the URL get() method which help to launch the URL
		driver.get("https://www.google.com");
		
		//to maximized the browser | manage();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		// to close browser window | close();
		driver.close();
		
		
		

	}

}
