package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features",
		glue= "stepdefinitions",
		plugin= 
		{"pretty",
		"html:target/cucumber",
		"json:target/cucumber.json",
		"junit:target/cucumber.xml"
		},
		monochrome= true,
		dryRun=true,
		strict=true,
		tags="@Smoke"
		)
public class TestRunner {

}
