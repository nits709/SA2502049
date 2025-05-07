package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.WebDriverDemos.BaseFunction;

public class AS_04 extends BaseFunction {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("Chrome");
		launchURL("https://www.makemytrip.com/");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		wait.withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
		.ignoring(StaleElementReferenceException.class)
		.pollingEvery(Duration.ofSeconds(2))
		.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".commonModal__close"))).click();
		
		driver.findElement(By.id("fromCity")).click();
	
		
		wait.withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
		.ignoring(StaleElementReferenceException.class)
		.pollingEvery(Duration.ofSeconds(2))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='From']"))).sendKeys("New");
		
		//driver.findElement(By.xpath("//*[@placeholder=\"From\"]")).sendKeys("New");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
