package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_05LocateByName {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		
		WebElement userName = driver.findElement(By.name("email"));
		//Read the element on the page whose name is email and store it in username variable
		// sendkeys function to type or enter string into the textfield
		userName.sendKeys("nitin@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345678876543");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		Thread.sleep(2000);
		//driver.close();

	
	
	}

}
