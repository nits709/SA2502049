package randomScenarios;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.WebDriverDemos.BaseFunction;

public class takeScreenShot_n_keepEachFile extends BaseFunction{

	
	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println("data "+ d.toString());
		String fileName = d.toString().replace(":","_").replace(" ","_");
		
		System.out.println(fileName);
		try {
			File sourceFileLoction = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sourceFileLoction, new File(fileName+ ".jpeg"));
			File file = new File("Nitin.jpeg");
		} catch (Exception e) {
			System.out.println("error " + e.getMessage());
		}
	}
	
	
}


