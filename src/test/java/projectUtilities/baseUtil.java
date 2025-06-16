package projectUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class baseUtil {

	
	
	public static void scrollDownToUserCount(AppiumDriver driver,WebElement area, int count) {
		
		for (int i = 0; i < count; i++) {
			
			driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
					"elementId", ((RemoteWebElement)area).getId(),
					"direction","down","percent", 1.0));
			
			System.out.println(" iterations " + i);
			
		}
		
	}
	
	public void scrollDown(AppiumDriver driver,WebElement area) {
		driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)area).getId(),
				"direction","down","percent", 1.0));
	}
	
	public void scrollUp(AppiumDriver driver,WebElement area) {
		driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)area).getId(),
				"direction","up","percent", 1.0));
	}
	
	public void scrollLeft(AppiumDriver driver,WebElement area) {
		driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)area).getId(),
				"direction","left","percent", 1.0));
	}
	
	public void scrollRight(AppiumDriver driver,WebElement area) {
		driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)area).getId(),
				"direction","right","percent", 1.0));
	}
}
