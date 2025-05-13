package com.Assignments;

import org.openqa.selenium.By;

import com.WebDriverDemos.BaseFunction;

public class AS_05MakeMyTrip extends BaseFunction{

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://www.makemytrip.com/bus-tickets/");
		sleep();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.cssSelector("[placeholder='From']")).sendKeys("coim");
		sleep();
		driver.findElement(By.cssSelector("#react-autowhatever-1 span")).click();

	}

}
