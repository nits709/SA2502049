package scrollingMechanism;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

import com.WebDriverDemos.BaseFunction;

public class scrollByheightJavaScriptExecutor extends BaseFunction {

	
	// first parameter would accepts method
	// second parameter would be elements/ target object.
	//window.scrollBy(0,document.body.scrollHeight) scroll the complete page /browser view point.
	//javaScriptExecutor
	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		launchURL("https://automationexercise.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		sleep();
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		
		sleep();
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)", "");
		
		sleep();
		driver.close();
		
		

	}

}
