package appium_androidSpecificOperations;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class lock_unlockfunctions {

	
	@Test
	public void testLockUnlockFunctions() throws InterruptedException {
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
		
		Thread.sleep(3000);
		
		//this lock my device
		((AndroidDriver)driver).lockDevice();
		
		System.out.println(" my devic locked");
		
		Thread.sleep(3000);
		
		((AndroidDriver)driver).unlockDevice();
		
		System.out.println(" my devic unlocked");
		
		
		Thread.sleep(3000);
		
		//rotate as function (screenorientation as class)
		((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
		
		
		System.out.println("this will rotate my mobile into landscape view");
		
		Thread.sleep(3000);
		
		((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
		
		System.out.println("this will rotate my mobile into portrait view");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}