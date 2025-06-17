package appium_androidSpecificOperations;

import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class AutomateAppCommands {
	
	
	@Test
	public void testAppCommands() throws InterruptedException {
		
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
		
		//this command would return the current package of the app.
		String currentpackage =((AndroidDriver)driver).getCurrentPackage();
		
		
		System.out.println("current package of my app "+ currentpackage);
		
		//below command would return the current state of my app
		System.out.println("current state --> "+((AndroidDriver)driver).queryAppState(currentpackage));
		
		Thread.sleep(5000);
		
		
		//terminate the App
		((AndroidDriver)driver).terminateApp(currentpackage);
		System.out.println("Terminate the app state --> "+((AndroidDriver)driver).queryAppState(currentpackage));
		
		Thread.sleep(5000);
		
		// activate the application
		
//		((AndroidDriver)driver).activateApp(currentpackage);
//		System.out.println("Activate state --> "+((AndroidDriver)driver).queryAppState(currentpackage));
		
		
		//backApp
//		((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(10));
//		System.out.println("Activate state --> "+((AndroidDriver)driver).queryAppState(currentpackage));
		
		
		//uninstall the app.
		((AndroidDriver)driver).removeApp(currentpackage);
		
		Thread.sleep(5000);
		System.out.println("app state --> "+((AndroidDriver)driver).queryAppState(currentpackage));
		
		// install the app
		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		((AndroidDriver)driver).installApp(apkPath);
		
		
		//check the state of application
		System.out.println("app state --> "+((AndroidDriver)driver).queryAppState(currentpackage));
		
		
		Thread.sleep(2000);
		
		
		//this activate theapp
		((AndroidDriver)driver).activateApp(currentpackage);
		System.out.println("Activate state --> "+((AndroidDriver)driver).queryAppState(currentpackage));
		Thread.sleep(4000);
		
		// run at background
		((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(10));
		System.out.println("Activate state --> "+((AndroidDriver)driver).queryAppState(currentpackage));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
