package testNGDemos;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.WebDriverDemos.BaseFunction;

public class TNG_05RandomScenarioWithTestNG extends BaseFunction {

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
		launchBrowser("Chrome");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("AfterMethod");
		sleep();
	}

	@Test(priority = 1)
	public void loginHRM() {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
	}

	@Test(priority = 2)
	public void loginHRM1() {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Nitin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test(priority = 3)
	public void loginHRM2() {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sachin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterTest
	public void exitDriver() {

		System.out.println("AfterTest");
		driver.close();
	}

}
