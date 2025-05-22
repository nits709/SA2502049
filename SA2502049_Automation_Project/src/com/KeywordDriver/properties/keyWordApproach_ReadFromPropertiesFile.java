package com.KeywordDriver.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keyWordApproach_ReadFromPropertiesFile {

	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;

	
	// keyword driver approach.
	@Test
	public void LoginHRM() {
		System.out.println("Application URL "+ prop.getProperty("appURL"));
		
		String[] appURL= prop.getProperty("appURL").split(",");
		System.out.println("1 URl" + appURL[0]);
		System.out.println("2 URl" + appURL[1]);
		String faceBookURL = appURL[0];
		
		driver.get(faceBookURL);
		driver.findElement(By.id(prop.getProperty("Login_Username_Id"))).sendKeys(prop.getProperty("Login_Username"));
		driver.findElement(By.id(prop.getProperty("Login_Password_Id"))).sendKeys(prop.getProperty("Login_Password"));
		driver.findElement(By.name(prop.getProperty("Login_Button_Name"))).click();
	}

	@BeforeTest
	public void beforeTest() {

		try {

			file = new File(
					"/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/SA2502049_Workspace/SA2502049_Automation_Project/src/keyWord.properties");
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis); // load the each key(property) at run time to access testcases.

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Message " + e.getMessage());
		}

	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
