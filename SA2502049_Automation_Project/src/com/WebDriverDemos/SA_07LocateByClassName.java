package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_07LocateByClassName {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://google.co.in");
		
		WebElement searchField = driver.findElement(By.className("gLFyf"));
		searchField.sendKeys("sachin");
		
		searchField.sendKeys(Keys.ENTER);  // will hit the enter button.
		//searchField.sendKeys(Keys.RETURN);
		
//		WebElement searchButton = driver.findElement(By.className("gNO89b"));
//		//searchButton.click();
//		


	}

}
