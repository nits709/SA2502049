package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_11LocateByLinkText {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.co.in/");
	
	
	driver.findElement(By.linkText("About")).click();
	driver.findElement(By.linkText("Gmail")).click();
	
	
	Thread.sleep(3000);
	driver.close();

	}

}
