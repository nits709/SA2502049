package testNGDemos;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TNG_08_Scripts_For_ParallelExecution  {

	
	@Test(priority = 1)
	public void openAmazon() {
		WebDriver driver = new ChromeDriver();
		//launchBrowser("Chrome");
		//launchURL("https://www.amazon.in/");
		//sleep();
	}

	@Test(priority = 2)
	public void OpenFaceBook() {
		WebDriver driver = new ChromeDriver();
		// takeScreenShots();
	}

	@Test(priority = 3)
	public void OpenMyntra() {
//		launchBrowser("Chrome");
//		launchURL("https://www.myntra.com/");
		WebDriver driver = new ChromeDriver();
		// takeScreenShots();
	}

	@Test(priority = 4)
	public void OpenGoogle() {
//		launchBrowser("Chrome");
//		launchURL("https://www.google.co.in");
		WebDriver driver = new ChromeDriver();
		// takeScreenShots();
	}

}
