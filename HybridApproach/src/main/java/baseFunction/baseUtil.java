package baseFunction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseUtil {

public 	WebDriver driver;
	
	public baseUtil() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

	
	public void getURL(String URL) {
		driver.get(URL);
	}

	
	public void enterData(By locator,String data) {
		driver.findElement(locator).sendKeys(data);
		
	}
}
