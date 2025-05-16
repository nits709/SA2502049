package testNGDemos;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.WebDriverDemos.BaseFunction;

public class TNG_07_PracticalImplimentationOfDP extends BaseFunction {

	// number of rows would equals to no. of test iterations
	// number of column would equals to no. of test variables

	@Test(dataProvider = "sendData")
	public void loginHRM(String username, String password) {
		// beforeMethod();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//*[@fill='currentColor'])[17]")).click();

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		// afterMethod();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		launchBrowser("Chrome");
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("AfterMethod");
		sleep();
		driver.close();
	}

	@DataProvider
	public Object[][] sendData() {

		Object[][] data = new Object[2][2];

		// row 2
		data[0][0] = "Admin";
		data[0][1] = "admin123";

		// row 3
		data[1][0] = "Admin";
		data[1][1] = "admin123";

		return data;

	}
}
