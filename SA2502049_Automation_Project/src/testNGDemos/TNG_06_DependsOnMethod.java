package testNGDemos;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.WebDriverDemos.BaseFunction;

public class TNG_06_DependsOnMethod extends BaseFunction{
	
	
	
	boolean flag = true;
	
	
	
	@Test (priority=1)
	public void search() {
		if(flag) {
			throw new SkipException("Skipping the test");
		}
		System.out.println("searching a phone");
	}
	
	
	@Test (priority=2, dependsOnMethods={"search"})
	public void selectPhone() {
		System.out.println("selecting a phone");
	}
	
	@Test (priority=3,dependsOnMethods = {"search", "selectPhone"})
	public void checkout() {
		System.out.println("doing checkout");
	}

}
