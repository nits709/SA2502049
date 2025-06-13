package MobileEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtilities.AppiumDriverInitialization;

public class clickGestures {

	
	@Test
	public void testClickGestures() {
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
			WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
			
			
			driver.executeScript("mobile: clickGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) ele1).getId()
				));
			
			
			System.out.println("successfully click Gesture done!");
	}
}
