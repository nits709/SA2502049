package appium_androidSpecificOperations;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class testIdemoAppMobileDevicePerformance {

	@Test
	public void testAppPerformancedata() {

		AppiumDriver testDriver = AppiumDriverInitialization.createAppiumDriver();
		List<String> allpackages = ((AndroidDriver) testDriver).getSupportedPerformanceDataTypes();

		System.out.println(allpackages);
		// [cpuinfo, memoryinfo, batteryinfo, networkinfo]

		String currentPackage = ((AndroidDriver) testDriver).getCurrentPackage();
		System.out.println("currentpackage " + currentPackage);

//		List<List<Object>> cpuinfor = ((AndroidDriver) testDriver).getPerformanceData(currentPackage, "cpuinfo", 10);
//
//		System.out.println("cpuinfor " + cpuinfor);

		List<List<Object>> memoryinfo = ((AndroidDriver) testDriver).getPerformanceData(currentPackage, "memoryinfo",
				10);

		System.out.println("cpuinfor " + memoryinfo);

		List<List<Object>> batteryinfo = ((AndroidDriver) testDriver).getPerformanceData(currentPackage, "batteryinfo",
				10);

		System.out.println("cpuinfor " + batteryinfo);

		List<List<Object>> networkinfo = ((AndroidDriver) testDriver).getPerformanceData(currentPackage, "networkinfo",
				10);

		System.out.println("cpuinfor " + networkinfo);

	}

}
