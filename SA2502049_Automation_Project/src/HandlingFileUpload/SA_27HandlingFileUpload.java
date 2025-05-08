package HandlingFileUpload;

import java.time.Duration;

import org.openqa.selenium.By;

import com.WebDriverDemos.BaseFunction;

public class SA_27HandlingFileUpload extends BaseFunction {
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("Chrome");
		//https://demo.guru99.com/test/upload/
		launchURL("https://demoqa.com/automation-practice-form");
		//driver.navigate().to(null) // launch the URL;
		//driver.navigate().refresh(); // refresh
		//driver.navigate().back(); // taking browser to previous url in single session
		//driver.navigate().forward(); // taking browser forward in single session.
		
		
		Thread.sleep(8000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.id("uploadfile_0")).click();
		//driver.findElement(By.id("uploadfile_0")).sendKeys("/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Reference_SeleniumNoteMaterials/Picture 1.png");
		
		driver.findElement(By.id("uploadPicture")).sendKeys("/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Reference_SeleniumNoteMaterials/Picture 1.png");
		//driver.findElement(By.id("terms")).click();
		
		//driver.findElement(By.id("submitbutton")).click();
	
	
	}

}
