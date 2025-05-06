package com.Assignments;

import org.openqa.selenium.By;

import com.WebDriverDemos.BaseFunction;

public class AS_03 extends BaseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser("Chrome");

		launchURL("https://www.redbus.in/");

		// Source City
		driver.findElement(By.id("src")).sendKeys("Kolh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text"))
				.click();

		// targetCity
		driver.findElement(By.id("dest")).sendKeys("Nash");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text"))
				.click();

		// select the calender
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/span[1]/div[4]/span[1]"))
				.click();

		driver.findElement(By.id("search_button")).click();
		
		Thread.sleep(5000);
		
		String busName = driver.findElement(By.xpath("//*[@id=\"18595057\"]/div[1]/div/div[1]/div[1]/div[1]/div[1]")).getText();
		
		System.out.println("travel Name "+ busName);
		
		
		//driver.close();
	}

}
