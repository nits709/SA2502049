package projectUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class baseUtil {

	
	static String filaPathLocation = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/SA2502049_Workspace/appiumAutomation/Screenshots//";
	
	public static void getScreenshot(AppiumDriver driver, String name) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(filaPathLocation +name+ ".png");

		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
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
