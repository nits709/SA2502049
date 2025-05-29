package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features/GoogleLinks.feature"},
				glue={"stepsDefinition"})
public class GoogleLinksRunner {
	
	/*
	 * Single Scenario = @Gmail
	 * 
	 * Multiple Scenario = @Smoke or @Sanity
	 * 
	 * Skip Scenario = not @Gmail
	 */

}
