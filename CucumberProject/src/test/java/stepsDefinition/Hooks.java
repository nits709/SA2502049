package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	
	
	@Before
	public void beforeHooks() {
		System.out.println("Before Hooks");
	}
	
	@After
	public void afterHooks() {
		System.out.println("after Hooks");
	}
}
