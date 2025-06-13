package appiumConnectionSetups;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class CreateAppiumConnection {

	
	@Test
	public void createAppiumTestDC() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "pixel_9_pro_xl" );
		
		///Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces
		//   /SA2502049_Workspace/appiumAutomation/src/test/resources/ApiDemos-debug.apk
		
		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		dc.setCapability("appium:app", apkPath);
		
		try {
			URL url = new URL("http://127.0.0.1:4723/");
			AppiumDriver appiumDriver = new AppiumDriver(url,dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
	}
}
