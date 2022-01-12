package bestBuy.com;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/shajib/Documents/study/QA/development/java/Exercise/CucumberTesting/Feature",
		glue = "/Users/shajib/Documents/study/QA/development/java/Exercise/CucumberTesting/src/test/java/bestBuy/com",
		plugin = {"htm:target/cucumber-html-report"},
		monochrome = true,
		dryRun = false
		
		
		)

public class testRunner {

}
