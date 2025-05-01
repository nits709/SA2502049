package com.WebDriverDemos.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.WebDriverDemos.BaseFunction;

public class SA_19HandlingDropdown extends BaseFunction {

	static String url = "https://register.rediff.com/register/register.php?FormName=user_details";

	public static void main(String[] args) throws InterruptedException {

		launchBrowser("Chrome");
		launchURL(url);

		WebElement countryDropdown = driver.findElement(By.id("country"));

		Select countryDD = new Select(countryDropdown);
		// All the operations on dropdown can be performed via this object only -
		// countryDD

		System.out.println("firstSelectedOption -> " + countryDD.getFirstSelectedOption().getText());

		System.out.println(countryDD.getOptions().get(0).getText()); // india

		List<WebElement> allCountryOptions = countryDD.getOptions();
		System.out.println("total no. of options -->" + allCountryOptions.size());

		// int i=0;
		for (WebElement DDoption : allCountryOptions) {
			System.out.println("options Name " + DDoption.getText());
			// i++;
		}

		for (int i = 0; i < allCountryOptions.size(); i++) {
			System.out.println("option Name " + allCountryOptions.get(i).getText());
		}

		
		
		countryDD.selectByVisibleText("Saint Martin"); // this select Saint Martin value from DD
		
		Thread.sleep(3000);
		
		
		countryDD.selectByValue("218");
		
		
		Thread.sleep(3000);
		
		countryDD.selectByIndex(0);
		
		
		
		
		
		
		
		
		
	}
}
