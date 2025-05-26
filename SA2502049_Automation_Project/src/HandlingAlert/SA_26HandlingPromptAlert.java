package HandlingAlert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.WebDriverDemos.BaseFunction;

public class SA_26HandlingPromptAlert extends BaseFunction {

	public static void main(String[] args) {
		
		
		Alert alt;
		launchBrowser("Chrome");
		launchURL("https://demoqa.com/alerts");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.id("promtButton")).click();
		alt = driver.switchTo().alert();

		alt.sendKeys("Nitin John"); // will enter data
		sleep();
		alt.accept(); // accpet the alert

		String alertMessage = driver.findElement(By.id("promptResult")).getText();
		System.out.println(" alert message " + alertMessage);

	}

}
