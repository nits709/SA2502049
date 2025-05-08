package HandlingMultipleWindowHandles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.WebDriverDemos.BaseFunction;

public class SA_28HandlingMultipleWindow extends BaseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser("Chrome"); // main | parent
		launchURL("https://www.naukri.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id=\"trending-naukri-wdgt\"]/div/div[1]/a[2]/span")).click();

		Set<String> windows = driver.getWindowHandles(); // would return the id of all opened in single session.
		Iterator<String> it = windows.iterator();

		String mainWindow = it.next(); // id of main window
		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		Thread.sleep(5000);

		System.out.println("MNC " + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
		
		driver.switchTo().window(mainWindow);
		driver.switchTo().defaultContent();
		
	
	}

}
