package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_16LocateByTagName {
	
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://google.co.in");
	
	//driver.findElement(By.tagName("a"));
	
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println("No. of links " +allLinks.size());
	
	
	//get() function which return the element of specific index.
	//allLinks.get(0).getText();
	
	//System.out.println("get Link Text "+allLinks.get(0).getText());
	//System.out.println("get Link Text "+allLinks.get(2).getText());
	
	for (int i = 0; i < allLinks.size(); i++) {
		System.out.println("get Link Text "+allLinks.get(i).getText());
		
		}
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver.close();
}

}
