package appium_androidSpecificOperations;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class AndroidSpecificCommands_2 {

	
	
	
	
	@Test
	public void testAndroidSpecific() throws InterruptedException {
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
	WebElement internetElement = driver.findElements(AppiumBy.id("com.android.systemui:id/chevron")).get(0);
	internetElement.click();
	
	//ON ----> off
		
	((AndroidDriver)driver).toggleWifi();
	
	Thread.sleep(2000);
	
	
	//off to On
	((AndroidDriver)driver).toggleWifi();
	
	Thread.sleep(2000);
	// off the mobile data
	
	((AndroidDriver)driver).toggleData();
	
	Thread.sleep(2000);
	
	((AndroidDriver)driver).toggleData();
	
	
	Thread.sleep(5000);
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Airplane mode\")")).click();
	
	
	
	Thread.sleep(2000);
	
	
	((AndroidDriver)driver).openNotifications();
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
