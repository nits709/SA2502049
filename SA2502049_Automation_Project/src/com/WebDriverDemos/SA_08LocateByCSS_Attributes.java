package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SA_08LocateByCSS_Attributes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("nitin@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("adasdas");
		driver.findElement(By.cssSelector("button[name='login']")).click();

		Thread.sleep(2000);
		driver.close();

	}

}
