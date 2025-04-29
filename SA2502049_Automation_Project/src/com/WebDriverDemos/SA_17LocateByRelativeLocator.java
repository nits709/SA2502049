package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SA_17LocateByRelativeLocator {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
	  
		//email
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass"))).sendKeys("nitin@gmail.com");
		
		//password
	    driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("email"))).sendKeys("12312341241");
		
		
	}
}
