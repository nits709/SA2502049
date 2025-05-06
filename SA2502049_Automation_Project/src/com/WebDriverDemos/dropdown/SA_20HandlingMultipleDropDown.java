package com.WebDriverDemos.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.WebDriverDemos.BaseFunction;

public class SA_20HandlingMultipleDropDown extends BaseFunction {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser("Chrome");

		launchURL("https://omayo.blogspot.com/");

		WebElement lstBox = driver.findElement(By.id("multiselect1"));
		Select carsBox = new Select(lstBox);

		List<WebElement> carList = carsBox.getOptions(); // will return all options are present in select class or tag
		System.out.println("number of cars " + carList.size()); // return total number of cars. dd size.
		
		carsBox.selectByIndex(1);  // select Swift
		carsBox.selectByIndex(3); // select Audi
		
		
		Thread.sleep(4000);
		
		carsBox.deselectAll(); // de-select the selected value in multiselect box
		
		
		Thread.sleep(4000);
		
		carsBox.selectByIndex(1);  // select Swift
		carsBox.selectByIndex(3); // select Audi
		
		Thread.sleep(2000);
		
		carsBox.deselectByIndex(1);
		
		
		Thread.sleep(2000);
		
		carsBox.deselectByIndex(3);
		
		driver.close();
		
		

	}

}
