package com.WebDriverDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;

public class RobotClass extends BaseFunction {
	
	
	
	public static void main(String[] args) throws AWTException {
		
		Robot rbt = new Robot();
		launchBrowser("Chrome");
		launchURL("https://sampleapp.tricentis.com/101/app.php");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.linkText("Automobile")).click();
		
		driver.findElement(By.linkText("Enter Insurant Data")).click();
		
		
		driver.findElement(By.id("open")).click();
		
		
		sleep();
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_ENTER);
	}

}
