package testNGDemos;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG_04_BeforeMethod_AfterMethod {

	// chrome | test | close browser
	// chrome | test | closebrowser
	
	
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterMethod
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
