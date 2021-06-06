package firstbdd;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"src/test/resources/features"},
	glue= {"firstbdd"},
	monochrome=true,
	dryRun=false,
	plugin = {"pretty","html:target/cucumber-html-reports","json:target/json/cucumber.json"}
		)
public class TestRunner {

	
}
