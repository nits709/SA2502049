package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_09LocateByCss_MultipleAttributes {

	
	
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.cssSelector("input[name='txtCustomerID'][class='form-control']"));
	username.sendKeys("dsfdasdfsfsdfs");
	
	
	WebElement password = driver.findElement(By.cssSelector("input[name='txtPassword'][type='password']"));
	password.sendKeys("dsfsdfsdfs");
	
	
	driver.findElement(By.cssSelector("input[name='Butsub'][type='submit']")).click();
	
	Thread.sleep(5000);
	
	driver.close();
}
}
