package ActionEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.WebDriverDemos.BaseFunction;

public class SA30_HandlingMouseHover extends BaseFunction{

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchURL("https://www.istqb.in/");
		Actions act = new Actions(driver);
		
		
		
//		WebElement linkSpec = driver.findElement(By.linkText("SPECIALIST"));
//		act.moveToElement(linkSpec).build().perform();
		
		List<WebElement> istqbNavigationLinks = driver.findElements(By.xpath("//nav[@role='navigation']/ul/li"));
		System.out.println("Total No. if links "+ istqbNavigationLinks.size());
		
		for (int i = 0; i < istqbNavigationLinks.size(); i++) {
			act.moveToElement(istqbNavigationLinks.get(i)).build().perform();
			Thread.sleep(2000);
		}
		
		
		//assignment - print the text of links by using same logic.

	}

}
