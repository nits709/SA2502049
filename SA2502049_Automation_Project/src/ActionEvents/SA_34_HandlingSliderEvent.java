package ActionEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.WebDriverDemos.BaseFunction;

public class SA_34_HandlingSliderEvent extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);

		driver.findElement(By.linkText("Slider")).click();

		driver.switchTo().frame(0);

		WebElement sliderElement = driver.findElement(By.xpath("//*[@id='slider']/span"));

		System.out.println("dimnesion " + sliderElement.getSize());

		System.out.println("location of x" + sliderElement.getLocation().x); // default location of x axis
		System.out.println("location of y" + sliderElement.getLocation().y);

		act.dragAndDropBy(sliderElement, sliderElement.getLocation().x + 500, sliderElement.getLocation().y).build()
				.perform();
		
		System.out.println("location of x" + sliderElement.getLocation().x); // update offset of x axis.

	}

}
