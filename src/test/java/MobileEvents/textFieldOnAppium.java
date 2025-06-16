package MobileEvents;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import projectUtilities.AppiumDriverInitialization;
import projectUtilities.baseUtil;

public class textFieldOnAppium {

	@Test
	public void testSendKeysOnAppium() {
		
AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();


		
		
		// click on views
		WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Views"));
		ele1.click();
		
		
		// locator of area 
		WebElement area = driver.findElement(AppiumBy.id("android:id/list"));
		
		
		baseUtil.scrollDownToUserCount(driver, area, 3);
		
		
		driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
		
//		WebElement textFieldArea =driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
//		
//		textFieldArea.sendKeys("Appium is webbased library");
		((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.H));
		((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.E));
		((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
		((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
		((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.O));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
