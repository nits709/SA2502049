package HandlingAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WebDriverDemos.BaseFunction;

public class SA_25HandlingAlert extends BaseFunction {

	public static void main(String[] args) {

		Alert alt;
		launchBrowser("Chrome");
		launchURL("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert(); // pass webdriver control to alert interface

		alt.accept(); // go and click on ok button.

		driver.switchTo().defaultContent(); // alert interface control back to webdriver.

		sleep();

		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());

		alt = driver.switchTo().alert();

		System.out.println("alert text " + alt.getText());  // get the text from alert.

		alt.accept(); // go and click on ok button.
		driver.close();

	}

}
