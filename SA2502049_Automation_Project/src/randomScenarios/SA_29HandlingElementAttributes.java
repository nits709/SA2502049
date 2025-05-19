package randomScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.WebDriverDemos.BaseFunction;

public class SA_29HandlingElementAttributes extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://demoqa.com/text-box");
		
		WebElement place = driver.findElement(By.id("userName"));
		
//		System.out.println("username attribute "+ place);
//		
//		String old = driver.findElement(By.id("userName")).getAttribute("placeholder");
//		System.out.println("username attribute "+ old);
		
		
		String getPlaceHolderAttribtue = place.getDomAttribute("placeholder");
		place.sendKeys("Nitin");
		sleep();
		place.clear();
		
		
	driver.close();

	}

}
