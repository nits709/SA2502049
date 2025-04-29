package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
	WebElement username =	driver.findElement(By.className("inputtext"));
	username.sendKeys("nitin@gmail.com");
	
	WebElement password = driver.findElement(By.className("_9npi"));
	password.sendKeys("34234243");
	
	Thread.sleep(2000);
	driver.close();
	}

}
