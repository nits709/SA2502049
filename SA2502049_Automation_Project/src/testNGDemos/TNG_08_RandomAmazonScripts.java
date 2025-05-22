package testNGDemos;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.WebDriverDemos.BaseFunction;

public class TNG_08_RandomAmazonScripts extends BaseFunction {

	String expecteUTL = "https://www.nitin.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3";

	@BeforeTest(alwaysRun = true)
	public void openBrowser() {
		launchBrowser("Chrome");
	}

	@BeforeMethod(alwaysRun = true)
	public void openAmazon() {
		launchURL("https://www.amazon.in/");
		sleep();
	}

	@Test(priority = 1, groups = "Sell")
	public void testSellLink() {
		driver.findElement(By.linkText("Sell")).click();

		// String currentURL = driver.getCurrentUrl();
		System.out.println("testSellLink");

		// Assert.assertEquals(currentURL,expecteUTL," sell url is invalid, please
		// verify");

		// takeScreenShots();
	}

	@Test(priority = 2, groups = "Sell")
	public void testBestSellerLink() {
		driver.findElement(By.partialLinkText("Best")).click();
		System.out.println("testBestSellerLink");
	}

	@Test(priority = 3, groups = "Devices")
	public void testElectronicLink() {
		// driver.findElement(By.partialLinkText("Electronics")).click();
		System.out.println("testElectronicLink");
	}

	@Test(priority = 4, groups = "Devices")
	public void testMobilesLink() {
		// driver.findElement(By.partialLinkText("Mobiles")).click();
		System.out.println("testMobilesLink");
	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("execution done!");
		takeScreenShots();
	}

	@AfterTest(alwaysRun = true)
	public void stopExecution() {
		driver.quit(); //
		// driver.close(); // amazon.com
	}

	public void takeScreenShots() {

		// TakesScreenShot is an interface from selenium WebDriver which help to take
		// ss.

		try {
			File sourceFileLoction = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sourceFileLoction, new File("Nitin.jpeg"));
			File file = new File("Nitin.jpeg");
		} catch (Exception e) {
			System.out.println("error " + e.getMessage());
		}

	}

}
