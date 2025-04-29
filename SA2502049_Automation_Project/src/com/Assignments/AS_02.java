package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_02 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.className("form-control"));
		username.sendKeys("dsfdasdfsfsdfs");
		
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("dsfsdfsdfs");
		
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
