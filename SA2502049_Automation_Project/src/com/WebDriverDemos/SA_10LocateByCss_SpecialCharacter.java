package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_10LocateByCss_SpecialCharacter {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://facebook.com");
		
		
		
		//contains *
		driver.findElement(By.cssSelector("input[data-testid*='-e']")).sendKeys("nitin@gmail.com");
		
		//$ ends with.
		driver.findElement(By.cssSelector("input[placeholder$='word']")).sendKeys("weqeqeqwe");
		
		//starts with ^
		driver.findElement(By.cssSelector("button[id^='u_0_5']")).click();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
