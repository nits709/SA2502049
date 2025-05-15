package testNGDemos;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG_03_BeforeTest_AfterTest {

	// Before Test -- executes once in entire session before all testcases
	// After Test - executes once in entire session after all testcases executed.
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	@Test(priority = 2)
	public void loginFaceBook() {
		System.out.println("Login Facebook");
	}

	@Test(priority = 3)
	public void loginMyntra() {
		System.out.println("Login Myntra");
	}

	@Test(priority = 4)
	public void loginstarAgile() {
		System.out.println("Login staragile");
	}

	

}
