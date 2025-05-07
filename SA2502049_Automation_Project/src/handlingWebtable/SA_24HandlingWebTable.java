package handlingWebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.WebDriverDemos.BaseFunction;


public class SA_24HandlingWebTable extends BaseFunction {

	public static void main(String[] args) {

		launchBrowser("Chrome");
		launchURL("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		List<WebElement> headers = driver.findElements(By.cssSelector(".dataTable th"));

		for (WebElement h : headers) {
			System.out.println("total no. of header size " + headers.size());
			System.out.println("header name " + h.getText());
		}

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

		for (int i = 0; i < rows.size(); i++) {

			System.out.println(" text from column "+ 
			driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td[1]/a")).getText()
			);
		}

		driver.close();

	}

}
