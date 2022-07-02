package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Login.feature",
		glue = "stepDefination",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/CucumberReport/report.html",
				"pretty","json:target/CucumberReport/report.json",
				"pretty","junit:target/CucumberReport/report.xml"
		} 
	
		)
public class Test {
	
}
