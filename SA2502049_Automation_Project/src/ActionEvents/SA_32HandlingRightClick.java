package ActionEvents;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.WebDriverDemos.BaseFunction;

public class SA_32HandlingRightClick extends BaseFunction {

	// contextClick -- would make right click on element
	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		Alert alt = null;
		WebElement RightClick = driver.findElement(By.cssSelector("#authentication span"));

		// 1st Approach for right click
		// act.moveToElement(RightClick).contextClick().build().perform();

		// 2nd Approach for right click
		act.contextClick(RightClick).build().perform();

		List<WebElement> listElementsOfRightClick = driver
				.findElements(By.xpath("//*[@id='authentication']/ul/li/span"));
		for (WebElement w : listElementsOfRightClick) {
			System.out.println("Text of element " + w.getText());
			w.click();
			alt.accept();
		}

		sleep();
		driver.close();

	}

}
