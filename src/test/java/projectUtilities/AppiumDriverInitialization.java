package projectUtilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumDriverInitialization {

	
	public static AppiumDriver appiumDriver;
	
	
	
	public static AppiumDriver createAppiumDriver() {
		
		UiAutomator2Options auto = new UiAutomator2Options();

		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		auto.setCapability("appium:app", apkPath);

		try {
			URL url = new URL("http://127.0.0.1:4723/");
			//appiumDriver = new AppiumDriver(url, auto);
			appiumDriver = new AndroidDriver(url,auto);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return appiumDriver;
	}
}
