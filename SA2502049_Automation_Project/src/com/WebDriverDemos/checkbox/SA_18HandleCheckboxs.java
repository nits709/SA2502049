package com.WebDriverDemos.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.WebDriverDemos.BaseFunction;

public class SA_18HandleCheckboxs extends BaseFunction {

	static String url = "https://register.rediff.com/register/register.php?FormName=user_details";

	public static void main(String[] args) {
		launchBrowser("Chrome");

		driver.get(url);
		WebElement chkbox = driver.findElement(By.cssSelector("[name^='chk_alt']"));

		System.out.println("Before Clicking on checkbox");
		System.out.println("Checking Visibility of checkbox " + chkbox.isDisplayed());
		System.out.println("Checking default state of checkbox " + chkbox.isSelected());  // false
		System.out.println("Checking enability of checkbox " + chkbox.isEnabled());

		if (!chkbox.isSelected()) {
			chkbox.click();  // accepts the checkbocx
		}

		System.out.println("After Clicking on checkbox");
		System.out.println("Checking Visibility of checkbox " + chkbox.isDisplayed());
		System.out.println("Checking default state of checkbox " + chkbox.isSelected()); // true
		System.out.println("Checking enability of checkbox " + chkbox.isEnabled());
		
		
		chkbox.click();  // de-selects the checkbox

		System.out.println("Checking default state of checkbox " + chkbox.isSelected()); // false
		
		driver.close();

	}

}
