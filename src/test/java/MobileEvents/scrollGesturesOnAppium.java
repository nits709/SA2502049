package MobileEvents;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtilities.AppiumDriverInitialization;
import projectUtilities.baseUtil;

public class scrollGesturesOnAppium {
	
	
	@Test
	public void testscrollGestures() {
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
		
		// click on views
		WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Views"));
		ele1.click();
		
		
		// locator of area 
		WebElement area = driver.findElement(AppiumBy.id("android:id/list"));
		
		
		baseUtil.scrollDownToUserCount(driver, area, 2);
//		driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//				"elementId", ((RemoteWebElement)area).getId(),
//				"direction","down","percent", 1.0));
				
	}

}
