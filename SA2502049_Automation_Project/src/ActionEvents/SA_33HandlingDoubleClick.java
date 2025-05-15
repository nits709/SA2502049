package ActionEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.WebDriverDemos.BaseFunction;

public class SA_33HandlingDoubleClick extends BaseFunction {

	public static void main(String[] args) {

		launchBrowser("Chrome");
		launchURL("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		//Alert alt=null;

		WebElement doubleClick = driver.findElement(By.xpath("//*[@id='authentication']/button"));
		//act.moveToElement(doubleClick).doubleClick().build().perform();
		
		act.doubleClick(doubleClick).build().perform();
		
		System.out.println("AlertText "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
	
	
	
	
	}

}
