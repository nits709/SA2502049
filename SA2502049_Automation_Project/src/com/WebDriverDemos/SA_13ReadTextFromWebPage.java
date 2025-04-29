package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_13ReadTextFromWebPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.className("form-control"));
		username.sendKeys("dsfdasdfsfsdfs");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("dsfsdfsdfs");
		
		
		driver.findElement(By.id("Butsub")).click();

		WebElement error = driver.findElement(By.id("lblMsg"));
		String errMsg = error.getText();
		
		System.out.println(" error Msg "+ errMsg );
		
		
		
		if(errMsg.contains("Invalid")) 
			System.out.println(" testcases pass");
			else
			System.out.println("testcases fail");	
		

		Thread.sleep(5000);

		driver.close();

	}

}
