package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_14LocateByFullXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		String titleText = driver.findElement(By.xpath("html/body/div/main/div[2]/div/div/h1")).getText();
		System.out.println("text "+ titleText);
		
		driver.findElement(By.xpath("html/body/div/main/div[2]/div/form/div/input")).sendKeys("ntin@gmail.comn");
		driver.findElement(By.xpath("html/body/div/main/div[2]/div/form/div[2]/input")).sendKeys("342342423423");
		
		driver.close();
	}

}
