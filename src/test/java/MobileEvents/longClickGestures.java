package MobileEvents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtilities.AppiumDriverInitialization;

public class longClickGestures {

	@Test
	public void testLongClickGestures() throws InterruptedException {
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();

		// click on views
		WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Views"));

		ele1.click();

		Thread.sleep(2000);
		// click on drag and drop
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

		Thread.sleep(2000);
		WebElement longClickElement = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
		ImmutableMap.of("elementId", ((RemoteWebElement) longClickElement).getId()));
		
		Thread.sleep(5000);

	}
}
