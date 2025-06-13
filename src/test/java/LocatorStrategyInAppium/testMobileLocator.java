package LocatorStrategyInAppium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtilities.AppiumDriverInitialization;

public class testMobileLocator {

	
	@Test
	public void testAppiumLocator() throws InterruptedException {

		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		String firstElementName = ele1.getText();
		ele1.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
		WebElement ele2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Animation\")"));
		String secondElementName = ele2.getText();
		ele2.click();
		
		Thread.sleep(3000);
		driver.navigate().back();

		
		WebElement ele3 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
		
		String thirdElementName = ele3.getText();
		ele3.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
		//assignment for you guys is : get the text of multiple element and click them one by one
		WebElement ele4 = driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
		String fourthElementName = ele4.getText();
		
		ele4.click();
		
		driver.navigate().back();
		
		
		//assignment for you guys is : get the text of multiple element and click them one by one
		WebElement ele5 = driver.findElements(AppiumBy.id("android:id/text1")).get(2);
		String fifthElementName = ele5.getText();
		
		ele5.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
