package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_03ReadTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.co.in");

		driver.manage().window().maximize();

		String pageTitle = driver.getTitle();
		
		String pageURL = driver.getCurrentUrl();
		
		System.out.println(" current page URL "+ pageURL);
		
		System.out.println("Title of page - "+ pageTitle);

		if(pageTitle.equals("Amazon"))
				System.out.println("testcases pass");
		
		else 
			System.out.println("testcases failed");
		
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
